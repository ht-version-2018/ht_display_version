package com.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ht.model.Project;
import com.ht.model.ProjectPic;
import com.ht.service.ProjectService_Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
@WebAppConfiguration("src/main/resources")
public class ProjectTest {

	@Autowired
	private ProjectService_Admin projectInstance;
	
	@Test
	public void getProjectList()
	{
		List<Project> projectList=projectInstance.getProjectList();
		System.out.println("projectList-->" + projectList);
	}
	
	@Test
	public void getProjectDetail() throws SQLException
	{
		Project project=projectInstance.getProject(1);
		System.out.println("project->" + project);
	}
	
	@Test
	public void getPrjPicList() throws SQLException
	{
		List<ProjectPic> prjList=projectInstance.getPrjPic(3,1);
		System.out.println("prjPicList-->" +  prjList);
	}
}
