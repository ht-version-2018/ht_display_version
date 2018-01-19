package com.ht.dao;


import java.sql.SQLException;
import java.util.List;

import com.ht.model.Plan;

public interface PlanDao_Admin {
	
	List<Plan> getPlanList(Integer page, String searchInfo) throws SQLException;
	
	int getPlanNum(String searchInfo) throws SQLException;

	int addPlan(Plan plan) throws SQLException;
	
	boolean updatePlanMainPic(Integer planId, String pic) throws SQLException;
	
	boolean editPlanPath(Integer planId, String planPath) throws SQLException;
	
	boolean delPlan(Integer planId) throws SQLException;
	
}
