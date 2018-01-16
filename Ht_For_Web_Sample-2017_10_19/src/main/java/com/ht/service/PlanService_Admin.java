package com.ht.service;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.Plan;

public interface PlanService_Admin {
	
	List<Plan> getPlanList(Integer page, String searchInfo) throws SQLException;

	int addPlan(Plan plan);
}

