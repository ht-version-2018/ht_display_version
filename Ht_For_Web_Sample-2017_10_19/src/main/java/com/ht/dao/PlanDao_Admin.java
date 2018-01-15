package com.ht.dao;


import java.sql.SQLException;
import java.util.List;

import com.ht.model.DesignPic;
import com.ht.model.Plan;

public interface PlanDao_Admin {
	
	List<Plan> getPlanList();
	//int getcount()throws SQLException;
	//public List<Plan> FindList(int page,int count);
	//public int count();

	List<Plan> getPlanByFloorAndArea(double area, int floor);

	//获取立面图或轴侧图
	List<DesignPic> getDesignByPlanIdAndTag(int id, int tag, int direct) throws SQLException;
	
	int addPlan(Plan plan);
}
