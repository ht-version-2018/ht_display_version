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
					int isOk=0;  //��ʶ�����ϴ��Ƿ�ɹ�	
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
								System.out.println("��������ϴ��ɹ�");
								filePath="E:/ũ��������ҵ��/���ݿ��ļ���ȡ/����ͼƬ/"+planName+"";
								File locFile = new File(filePath);
								if(locFile.mkdirs()){
									System.out.println("�����ļ���·��" + locFile.getPath());
								}else{
									System.out.println("�����ϴ�ʧ��");
								}
							}
							return "success";
//							return "�����ϴ��ɹ�";
					}catch(IllegalArgumentException | IllegalStateException e){
						System.out.println("�ϴ����̳������⣬������ˢ��ҳ�����±༭����");
						return "error";
//						return "�ϴ����̳������⣬������ˢ��ҳ�����±༭����";
					}
				}
}
