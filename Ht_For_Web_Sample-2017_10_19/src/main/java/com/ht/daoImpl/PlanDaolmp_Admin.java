package com.ht.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ht.dao.PlanDao_Admin;
import com.ht.model.Plan;


@Repository
public  class PlanDaolmp_Admin implements PlanDao_Admin{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public List<Plan> getPlanList(Integer page, String searchInfo) throws SQLException {
		String sql = new String();
		
		if( searchInfo == null || searchInfo.trim().equals("")){
			sql = "select * from plan limit "+ (page-1)*10 + ", 10";
		}else{
			sql = "select * from plan limit "+ (page-1)*10 + ", 10";
		}
		List<Plan> PlanList =jdbcTemplate.query(sql, new BeanPropertyRowMapper(Plan.class));
		return PlanList;
	}
	
	@Override
	public int addPlan(Plan plan) {
		String sql = "insert into plan(planName,planFloor,planMinArea,planMaxArea,planStatus,planPicPath) values(?,?,?,?,?,?)";
		
		return jdbcTemplate.update(sql, new Object[]{
			//plan.getPlanName(),plan.getPlanFloor(),plan.getPlanMinArea(),plan.getPlanMaxArea(),1,plan.getPlanPicPath()
		});
	}
 }
