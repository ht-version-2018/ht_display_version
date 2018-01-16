package com.ht.dao;


import java.sql.SQLException;
import java.util.List;

import com.ht.model.Plan;

public interface PlanDao_Admin {
	
	List<Plan> getPlanList(Integer page, String searchInfo) throws SQLException;

	int addPlan(Plan plan);
}
