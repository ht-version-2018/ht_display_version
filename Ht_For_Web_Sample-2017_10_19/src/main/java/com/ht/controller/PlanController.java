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
		//����ϴ��ļ�����������������
		request.setCharacterEncoding("utf-8"); 
		 //�Ȼ�ȡ�������ļ�����Ҫ���浽�����·��
        String path = request.getServletContext().getRealPath("/mainPic");
        String planPath = request.getServletContext().getRealPath("/plan") + "/" + year + "/" + month + "/" + day;
        String fileName = uploadfile.getOriginalFilename();
        System.out.println("path-->" + path);
        System.out.println("planPath-->" + planPath);
        int planId = 0;
        
//    	User user = (User) session.getAttribute("uu");
    	User user = new User();
    		
        //�����ϴ����ļ�"��"���ܻ������ģ���������Ŀ¼���е���Դ���Ʋ��ܹ������ģ����Ҫ����ת���ɷ����ĵ��ļ�����Ҫ�����ļ��������ظ���
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String ext = fileName.substring(fileName.lastIndexOf(".")); //��ȡ�ļ�����չ����.jpg
        String newFileName = uuid+ext;
       
        plan.setCreateTime(sdf.format(date));
		plan.setAuditState(1);
		plan.setPlanPic(newFileName);
		plan.setPlanPath(year+"/" + month + "/" + day + "/" + user.getUserId()+""+ planId);
		
	
		//��������
		try {
		   planId = planInstance.addPlan(plan);
		   session.setAttribute("planId", planId);
		  
		   File file = new File(path);
		   File planFile = new File(planPath +"/" + user.getUserId()  + planId);
		 
		   if(!file.exists()){  //����ͼƬ�ļ���
		      file.mkdirs();
		   }
		   if(!planFile.exists()){  //����ͼƬ�ļ���
			   planFile.mkdirs();
		   }
		   File locFile = new File(path + "/" + newFileName);
		   uploadfile.transferTo(locFile);
		 
		   request.getRequestDispatcher("/Admin/plan-pic-upload.jsp").forward(request, response);  
		} catch (SQLException | IllegalStateException e) {
			log.info("��������ʧ��");
			e.printStackTrace();
		} 
	}
	
}
