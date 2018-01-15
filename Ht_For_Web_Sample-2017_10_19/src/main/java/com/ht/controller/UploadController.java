package com.ht.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired
	private PlanService_Admin planInstance;
	
	@RequestMapping(value = "/uploadFormData", method = RequestMethod.POST,produces="text/json")
	@ResponseBody
	public String uploadFormData(@RequestParam(value = "file", required = false)MultipartFile file,
            String planName,int planFloor,String planIntro, HttpServletRequest request) 
            		throws IOException, ServletException, SQLException{
					int isOk=0;  //标识方案上传是否成功	
					String filePath = null;
					try {//Integer planMinArea,Integer planMaxArea,
							Plan plan = new Plan();
							plan.setPlanName(planName);
							plan.setPlanFloor(planFloor);
							plan.setPlanPicPath(file.getOriginalFilename());
							plan.setPlanMinArea(0);
							plan.setPlanMaxArea(0);
							
							isOk = planInstance.addPlan(plan);
							if(isOk == 1){
								System.out.println("方案简介上传成功");
								filePath="E:/农房建筑工业化/数据库文件读取/方案图片/"+planName+"";
								File locFile = new File(filePath);
								if(locFile.mkdirs()){
									System.out.println("方案文件夹路径" + locFile.getPath());
								}else{
									System.out.println("方案上传失败");
								}
							}
							return "success";
//							return "方案上传成功";
					}catch(IllegalArgumentException | IllegalStateException e){
						System.out.println("上传过程出现问题，您可以刷新页面重新编辑方案");
						return "error";
//						return "上传过程出现问题，您可以刷新页面重新编辑方案";
					}
				}
}
