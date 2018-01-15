package com.ht.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.ProjectDao_Admin;
import com.ht.model.Project;
import com.ht.model.ProjectPic;
import com.ht.service.ProjectService_Admin;

@Service("ProjectService")
public class ProjectServiceImpl_Admin implements ProjectService_Admin{
	
	@Autowired
	private ProjectDao_Admin projectDao;

	@Override
	public List<Project> getProjectList() {
		return projectDao.getProjectList();
	}

	@Override
	public Project getProject(int projectId) throws SQLException {
		return projectDao.getProject(projectId);
	}
	
	@Override
	public List<ProjectPic> getPrjPic(int projectId, int tag) throws SQLException{
		return projectDao.getPrjPic(projectId, tag);
	}

}
