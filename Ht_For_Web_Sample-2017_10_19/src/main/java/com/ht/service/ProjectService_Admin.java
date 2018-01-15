package com.ht.service;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.Project;
import com.ht.model.ProjectPic;

public interface ProjectService_Admin {

	List<Project> getProjectList();
	
	Project getProject(int projectId) throws SQLException;
	
	List<ProjectPic> getPrjPic(int projectId, int tag) throws SQLException;
}
