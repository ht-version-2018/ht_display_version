package com.ht.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired
	private PlanService_Admin planInstance;
	
	  
	    @ResponseBody  
	    @RequestMapping(value="test")  
	    public void testUpload(MultipartHttpServletRequest request) throws IOException {  
	        /* 
	         * MultipartHttpServletRequest: �̳���HttpServletRequest�Լ�MultipartRequest. 
	         * ����MultipartRequest�ж�������صķ��ʲ���. MultipartHttpServletRequest��д 
	         * ��HttpServletRequest�еķ���, ����������չ. �����HttpServletRequest�����ղ� 
	         * ��, ����Ҫ�Ƚ���תΪMultipartHttpServletRequest���� 
	         * MultipartHttpServletRequest request = (MultipartHttpServletRequest) HttpServletRequest; 
	         */  
	          
	        /* 
	         * ��˵�ظղŵ�form, ���������ڵ����ļ�ѡ�����ϴ����ļ�1, ����ļ�ѡ�����ϴ����ļ�2, 3, 4. 
	         * ��ô���ں�̨���յ���, ������ô���, ����һ��Map����ʽ(ʵ��������̨�������Map���洢��). 
	         * ���Map��Key��ʲô��? ��������<input>��ǩ�е�name=""����. Value�������Ǹղ��ϴ��� 
	         * �ļ�, ͨ�������ʾ�����Կ���ÿһ��Value����һ��������Ӧ�ļ����ϵ�List 
	         *  
	         * ������̨���յ���Map��������: 
	         * fileTest: �ļ�1 
	         * fileList: �ļ�2, �ļ�3, �ļ�4 
	         *  
	         * ��Ȼ�ӷ������ı������������ǵõ��ļ���, ��ʵ��������ļ������ϴ����ļ�����û��ʲô��ϵ. 
	         * �ղ�˵�����Map��Key����<input>��ǩ�е�name=""����, ���Եõ���Ҳ����������Ե�ֵ 
	         */  
	        Iterator<String> fileNames = request.getFileNames();  
	        while (fileNames.hasNext()) {  
	              
	            //��fileNames�����е�ֵ�����  
	            String fileName=fileNames.next();  
	            System.out.println("jr");
	            System.out.println("fileName: "+fileName);  
	     
	            /* 
	             * request.getFiles(fileName)������ͨ��fileName���Key, �õ���Ӧ���ļ� 
	             * �����б�. ֻ�������Map��, �ļ�����װ��MultipartFile���� 
	             */  
	            List<MultipartFile> fileList=request.getFiles(fileName);  
	              
	            if (fileList.size()>0) {  
	                  
	                //�����ļ��б�  
	                Iterator<MultipartFile> fileIte=fileList.iterator();  
	                  
	                while (fileIte.hasNext()) {  
	                      
	                    //���ÿһ���ļ�  
	                    MultipartFile multipartFile=fileIte.next();  
	                      
	                    //���ԭ�ļ���  
	                    String originalFilename = multipartFile.getOriginalFilename();  
	                    System.out.println("originalFilename: "+originalFilename);  
	                      
	                    //���ñ���·��.   
	                    String path ="F:/testUpload/";  
	                      
	                    //����·����Ӧ��Ŀ¼�Ƿ����. ����������򴴽�Ŀ¼  
	                    File dir=new File(path);  
	                    if (!dir.exists()) {  
	                        dir.mkdirs();  
	                    }  
	                      
	                    String filePath = path + originalFilename;  
	                    System.out.println("filePath: "+filePath);  
	                      
	                    //�����ļ�  
	                    File dest = new File(filePath);  
	                    if (!(dest.exists())) {  
	                         
	                        /* MultipartFile�ṩ��void transferTo(File dest)����, 
	                         * ����ȡ�����ļ���File��ʽ������ָ��·��. 
	                        */
	                        multipartFile.transferTo(dest);  
	                          
	                         
	                        /* �������ļ�������������, MultipartFileҲ�ṩ�� 
	                         * InputStream getInputStream()������ȡ�ļ��������� 
	                         *  
	                         * �����������伴Ϊͨ�� 
	                         * org.apache.commons.io.FileUtils�ṩ�� 
	                         * void copyInputStreamToFile(InputStream source, File destination) 
	                         * ����, ��ȡ���������䱣����ָ��·�� 
	                           
	                        //FileUtils.copyInputStreamToFile(multipartFile.getInputStream(), dest);  
	                    }  
	                      
	                    //MultipartFileҲ�ṩ������һЩ����, ������ȡ�ļ��Ĳ�������  
	                      
	                    //��ȡ�ļ�contentType  
	                    String contentType=multipartFile.getContentType();  
	                    System.out.println("contentType: "+contentType);  
	                      
	                     
	                     /* ��ȡname 
	                     * ��ʵ���name�������ᵽ��getFileNameֵ��һ����, 
	                     * ����Map��Key��ֵ. ��ǰ̨ҳ��<input>��name="" 
	                     * ����. ���������getFileNameֻ�ǵõ����Map��Key, 
	                     * ��Spring�ڴ����ϴ��ļ���ʱ�������ֵ��name���� 
	                     * ��¼����Ӧ��ÿһ���ļ�. �����Ҫ���ļ������ȡ��� 
	                     * ֵ, �����ʹ�ø÷���  
	                     */
	                        
	                    String name=multipartFile.getName();  
	                    System.out.println("name: "+name);  
	                      
	                    //��ȡ�ļ���С, ��λΪ�ֽ�  
	                    long size=multipartFile.getSize();  
	                    System.out.println("size: "+size);  
	                      
	                    System.out.println("---------------------------------------------------");  
	                }  
	            }  
	        }  
	    }  
	} 
}
	
	/*@RequestMapping(value = "/uploadFormData", method = RequestMethod.POST,produces="text/json")
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
}*/
