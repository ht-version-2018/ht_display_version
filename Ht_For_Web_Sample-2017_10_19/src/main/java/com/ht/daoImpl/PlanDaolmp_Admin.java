package com.ht.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
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
			sql = "select * from plan where planName like '%"+searchInfo+"%' limit "+ (page-1)*10 + ", 10";
		}
		List<Plan> PlanList =jdbcTemplate.query(sql, new BeanPropertyRowMapper(Plan.class));
		return PlanList;
	}
	
	
	@Override
	public int addPlan(Plan pl) {
		KeyHolder keyHolder = new GeneratedKeyHolder();  
		
		String sql = "insert into plan(author,area,areaLength,areaWidth,floor,"
				+ "roofStyle,planStyle,elevaStyle,planPic,planState,auditState,"
				+ "createTime,download,planName,planPath) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		jdbcTemplate.update( new PreparedStatementCreator(){

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = jdbcTemplate.getDataSource()
						.getConnection().prepareStatement(sql,new String[]{"author","area","areaLangth","areaWidth","floor","roofStyle","planStyle","elevaStyle","planPic","planState","auditState","createTime","download","planName","planPath"});
				ps.setString(1, pl.getAuthor());
				ps.setDouble(2, pl.getArea());
				ps.setDouble(3, pl.getAreaLength());
				ps.setDouble(4, pl.getAreaWidth());
				ps.setInt(5, pl.getFloor());
				ps.setInt(6, pl.getRoofStyle());
				ps.setInt(7, pl.getPlanStyle());
				ps.setInt(8, pl.getElevaStyle());
				ps.setString(9, pl.getPlanPic());
				ps.setInt(10, 1);
				ps.setInt(11, pl.getAuditState());
				ps.setString(12, pl.getCreateTime());
				ps.setInt(13, 0);
				ps.setString(14, pl.getPlanName());
				ps.setString(15, pl.getPlanPath());
				return ps;
			}
		}, keyHolder);
		return keyHolder.getKey().intValue();
	}

	@Override
	public int getPlanNum(String searchInfo) throws SQLException {
		String sql = new String();
		if(searchInfo.isEmpty() || searchInfo.trim().equals(null)){
			sql = "select count(*) from plan";
		}else{
			sql = "select count(*) from plan where planName like '%"+searchInfo+"%'";
		}
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}

	
	@Override
	public boolean updatePlanMainPic(Integer planId, String pic) throws SQLException {
		String sql = "update plan set planPic='"+pic+"' where planId=" + planId;
		return jdbcTemplate.update(sql)>0;
	}

	@Override
	public boolean editPlanPath(Integer planId, String planPath) throws SQLException {
		String sql = "update plan set planPath='"+planPath+"' where planId=" + planId;
		return jdbcTemplate.update(sql)>0;
	}

	@Override
	public boolean delPlan(Integer planId) throws SQLException {
		String sql = "delete from plan where planId = " + planId;
		return jdbcTemplate.update(sql)>0;
	}
	
 }
