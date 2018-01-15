package com.ht.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ht.dao.ProjectDao_Admin;
import com.ht.model.Project;
import com.ht.model.ProjectPic;

@Repository
public class ProjectDaoImpl_Admin implements ProjectDao_Admin{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		String sql="select * from project";
		List<Project> projectList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Project.class));
		return projectList;
	}
	
	@Override
	public Project getProject(int projectId) throws SQLException{
		String sql = "select * from project where projectId="+projectId;
		Project project = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Project>(Project.class));
		return project;
	}

	@Override
	public List<ProjectPic> getPrjPic(int projectId,int tag) throws SQLException {
		String sql = "select * from projectpic where projectId="+projectId + " and picTag=" + tag;
		List<ProjectPic> prjPicList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(ProjectPic.class));
		return prjPicList;
	}
	
	
}
