package com.ht.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ht.model.Plan;
import com.ht.model.User;
import com.ht.service.PlanService_Admin;

@Controller
@MultipartConfig
@RequestMapping("/planAdmin")
public class PlanController {

	@Autowired
	private PlanService_Admin planInstance;
	
	Logger log = Logger.getLogger("planLog");
	
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
	
	@RequestMapping("/planList")
	@ResponseBody
	public List<Plan> getPlanList(@RequestParam Integer page, @RequestParam String searchInfo){
		List<Plan> planList = null;
		try {
			planList = planInstance.getPlanList(page, searchInfo);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return planList;
	}
	
	@RequestMapping("/planNum")
	@ResponseBody
	public Integer getPlanNum(@RequestParam String searchInfo){
		Integer num = null;
		try {
			num = planInstance.getPlanNum(searchInfo);
			System.out.println("num-->" + num);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return num;
	}
	
	@RequestMapping("/delPlan")
	@ResponseBody
	public boolean planDel(@RequestParam Integer planId){
		boolean isOk = false;
		try {
		    isOk = planInstance.delPlan(planId);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return isOk;
	}
	
	@ExceptionHandler({ TypeMismatchException.class })
	@RequestMapping(value="/planAdd")
	@ResponseBody
	public void planAdd(Plan plan,MultipartFile uploadfile,HttpServletRequest request,
			HttpServletResponse response,HttpSession session) throws IOException, ServletException{
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		//解决上传文件名的中文乱码问题
		request.setCharacterEncoding("utf-8"); 
		 //先获取所接收文件我们要保存到哪里的路径
        String path = request.getServletContext().getRealPath("/mainPic");
        String planPath = request.getServletContext().getRealPath("/plan") + "/" + year + "/" + month + "/" + day;
        String fileName = uploadfile.getOriginalFilename();
        System.out.println("path-->" + path);
        System.out.println("planPath-->" + planPath);
        int planId = 0;
        
//    	User user = (User) session.getAttribute("uu");
    	User user = new User();
    		
        //由于上传的文件"名"可能会有中文，而服务器目录当中的资源名称不能够用中文，因此要把它转换成非中文的文件名（要考虑文件名不能重复）
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String ext = fileName.substring(fileName.lastIndexOf(".")); //截取文件的扩展名：.jpg
        String newFileName = uuid+ext;
       
        plan.setCreateTime(sdf.format(date));
		plan.setAuditState(1);
		plan.setPlanPic(newFileName);
		plan.setPlanPath(year+"/" + month + "/" + day + "/" + user.getUserId()+""+ planId);
		
	
		//创建方案
		try {
		   planId = planInstance.addPlan(plan);
		   session.setAttribute("planId", planId);
		  
		   File file = new File(path);
		   File planFile = new File(planPath +"/" + user.getUserId()  + planId);
		 
		   if(!file.exists()){  //封面图片文件夹
		      file.mkdirs();
		   }
		   if(!planFile.exists()){  //方案图片文件夹
			   planFile.mkdirs();
		   }
		   File locFile = new File(path + "/" + newFileName);
		   uploadfile.transferTo(locFile);
		 
		   request.getRequestDispatcher("/Admin/plan-pic-upload.jsp").forward(request, response);  
		} catch (SQLException | IllegalStateException e) {
			log.info("方案创建失败");
			e.printStackTrace();
		} 
	}
	
}
