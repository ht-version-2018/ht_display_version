package com.ht.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.DesignPic;
import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Controller
public class PlanController {

	@Autowired
	private PlanService_Admin planInstance;
	
	
	@RequestMapping("/plan")
	@ResponseBody
	public List<Plan> getPlanLIst(){
		List<Plan> planList=planInstance.getPlanList();
		return planList;
	}

	@RequestMapping("/getPlan")
	@ResponseBody
	public List<Plan> getPlanByFloorAndArea(@RequestParam double area,@RequestParam int floor){
		List<Plan> plan = planInstance.getPlanByFloorAndArea(area, floor);
		System.out.println("plan-->" + plan);
		return plan;
	}
		
	
	@RequestMapping("/designPic")
	@ResponseBody
	public List<DesignPic> getDesignByPlanIdAndTag(@RequestParam int id,@RequestParam int tag,@RequestParam int direct) throws SQLException{
		System.out.println("direct-->"+direct);
		List<DesignPic> designPic = planInstance.getDesignByPlanIdAndTag(id, tag, direct);
		System.out.println("id  tag  direct-->" + id +" " + tag + " " + direct);
		System.out.println("designPic-->" + designPic);
		return designPic;
	}
}
