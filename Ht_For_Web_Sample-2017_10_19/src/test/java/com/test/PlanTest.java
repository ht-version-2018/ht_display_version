package com.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ht.model.DesignPic;
import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
@WebAppConfiguration("src/main/resources")

public class PlanTest {
	@Autowired
	private PlanService_Admin PlanInstance;
	
	@Test
	public void getPlanList(){
		List<Plan> PlanList = PlanInstance.getPlanList();
		System.out.println("PlanList-->" +PlanList);
	}
	@Test
	public void getPlanList1(){
		List<Plan> PlanList = PlanInstance.getPlanByFloorAndArea(60, 2);
		System.out.println("PlanList-->" +PlanList);
	}
	@Test
	public void getPlanList2() throws SQLException{
		List<DesignPic>  s= PlanInstance.getDesignByPlanIdAndTag(1, 1, 0);
		System.out.println("PlanList-->" +s);
	}
	
	@Test
	public void addPlan(){
		Plan plan = new Plan();
		plan.setPlanFloor(2);
		plan.setPlanMaxArea(30);
		plan.setPlanMinArea(10);
		plan.setPlanName("ֻ�ǲ���һ��");
		plan.setPlanPicPath("1.jpg");
		plan.setPlanStatus(1);
		int ok = PlanInstance.addPlan(plan);
		System.out.println("ok-->"+ ok);
	}
}
