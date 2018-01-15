package com.ht.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.Project;
import com.ht.model.ProjectPic;
import com.ht.service.ProjectService_Admin;

@Controller
public class ProjectController {

	@Autowired 
	private ProjectService_Admin projectInstance;
	
	
	@RequestMapping("/project")
	@ResponseBody
	public List<Project> getProjectList(){
		List<Project> projectList=projectInstance.getProjectList();
		return projectList;
	}
	
	//前台试点工程获取详情
	@RequestMapping("/prjEntity")
	@ResponseBody
	public Project getProject(@RequestParam(value="projectId",required=false) Integer projectId) throws SQLException{
		Project project = projectInstance.getProject(projectId);
		System.out.println("project-->" + project);
		return project;
	}
	
	@RequestMapping("/prjPicList")
	@ResponseBody
	public List<ProjectPic> getPrjList(@RequestParam(value="projectId",required=false) Integer projectId,
			@RequestParam(value="tag",required=false) Integer tag) throws SQLException{
		System.out.println("productId-->" + projectId + " " + tag );
		List<ProjectPic> prjList = projectInstance.getPrjPic(projectId, tag);
		System.out.println("prjPicList-->" + prjList);
		return prjList;
	}
}
