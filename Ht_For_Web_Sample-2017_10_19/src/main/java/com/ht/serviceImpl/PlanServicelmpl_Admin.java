package com.ht.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.PlanDao_Admin;
import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Service("PlanService")
public class PlanServicelmpl_Admin implements PlanService_Admin{
	
	@Autowired
	private PlanDao_Admin planDao;

	@Override
	public List<Plan> getPlanList(Integer page, String searchInfo) throws SQLException{
		return planDao.getPlanList(page, searchInfo);
	}
	@Override
	public int addPlan(Plan plan) throws SQLException {
		int planId = 0;
		try {
			planId = planDao.addPlan(plan);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		return planId;
	}
	@Override
	public int getPlanNum(String searchInfo) throws SQLException {
		return planDao.getPlanNum(searchInfo);
	}
	@Override
	public boolean updatePlanMainPic(Integer planId, String pic) throws SQLException {
		return planDao.updatePlanMainPic(planId, pic);
	}
	@Override
	public boolean editPlanPath(Integer planId, String planPath) throws SQLException {
		return true;
	}
	@Override
	public boolean delPlan(Integer planId) throws SQLException {
		return planDao.delPlan(planId);
	}
}
