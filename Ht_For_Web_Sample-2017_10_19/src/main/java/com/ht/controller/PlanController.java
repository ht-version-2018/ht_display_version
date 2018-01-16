package com.ht.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@Controller
@RequestMapping("/planAdmin")
public class PlanController {

	@Autowired
	private PlanService_Admin planInstance;
	
	
	@RequestMapping("/planList")
	@ResponseBody
	public List<Plan> getPlanList(@RequestParam Integer page, @RequestParam String searchInfo){
		List<Plan> planList = null;
		try {
			planList = planInstance.getPlanList(page, searchInfo);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return planList;
	}
	
	
}
