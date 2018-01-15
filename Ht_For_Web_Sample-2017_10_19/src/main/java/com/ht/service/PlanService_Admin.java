package com.ht.service;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.DesignPic;
import com.ht.model.Plan;

public interface PlanService_Admin {
	
	List<Plan> getPlanList();

	List<Plan> getPlanByFloorAndArea(double area, int floor);

	List<DesignPic> getDesignByPlanIdAndTag(int id, int tag, int direct) throws SQLException;
	
	int addPlan(Plan plan);
}

