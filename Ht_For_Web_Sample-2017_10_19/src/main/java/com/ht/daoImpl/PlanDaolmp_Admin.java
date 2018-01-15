package com.ht.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ht.dao.PlanDao_Admin;
import com.ht.model.DesignPic;
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
	public List<Plan> getPlanList() {
		String sql="select * from plan";
		List<Plan> PlanList =jdbcTemplate.query(sql, new BeanPropertyRowMapper(Plan.class));
		return PlanList;
	}
	@Override
	public List<Plan> getPlanByFloorAndArea(double area,int floor){
		String sql="select planId,planpicpath,planName from plan where planFloor = "+floor+" and "+area+" >= planminArea and "+area+" <=planmaxArea and planstatus = 1";
		List<Plan> PlanList =jdbcTemplate.query(sql, new BeanPropertyRowMapper(Plan.class));
		return PlanList;
	}
	@Override
	public List<DesignPic> getDesignByPlanIdAndTag(int id,int tag,int direct) throws SQLException{
		String sql = null;
	    
		if(direct==0){//不考虑方向，获取方案所有的立面图/轴测图
			sql="select * from designPic where planid = "+id+" and designPicTag = "+tag+" and designPicStatus = 1";
		}else{//获取平面图或是轴测图，tag=1表示轴测图,tag=2表示立面图
			sql="select * from designPic where planid = "+id+" and designPicTag = "+tag+" and designPicStatus = 1 and designPicDirect="+direct;
		}
		List<DesignPic> designPic = jdbcTemplate.query(sql,new BeanPropertyRowMapper(DesignPic.class));
		return designPic;
	}

	@Override
	public int addPlan(Plan plan) {
		String sql = "insert into plan(planName,planFloor,planMinArea,planMaxArea,planStatus,planPicPath) values(?,?,?,?,?,?)";
		
		return jdbcTemplate.update(sql, new Object[]{
			plan.getPlanName(),plan.getPlanFloor(),plan.getPlanMinArea(),plan.getPlanMaxArea(),1,plan.getPlanPicPath()
		});
	}
 }
