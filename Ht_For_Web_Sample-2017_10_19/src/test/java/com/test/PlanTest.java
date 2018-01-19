package com.test;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ht.model.Plan;
import com.ht.service.PlanService_Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
@WebAppConfiguration("src/main/resources")

public class PlanTest {
	@Autowired
	private PlanService_Admin planInstance;
	
	@Test
	public void getPlanList(){
		List<Plan> planList = new LinkedList<Plan>();
		try {
			planList = planInstance.getPlanList(1,null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("PlanList-->" +planList);
	}
	
	@Test
	public void getPlanNum(){
		try {
			System.out.println("planNum-->" + planInstance.getPlanNum("13"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*@Test
	public void getPlanList1(){
		List<Plan> PlanList = PlanInstance.getPlanByFloorAndArea(60, 2);
		System.out.println("PlanList-->" +PlanList);
	}
*/	
	@Test
	public void addPlan(){
		
		Plan plan = new Plan("张三", 100.00, 10.00, 10.00, 4, 1, 1, 1, "baidu.jpg", 1, "方案一", 1,1, "2018-01-01 21:24:48");
		try {
			System.out.println("addPlan-->" + planInstance.addPlan(plan));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*plan.setPlanFloor(2);
		plan.setPlanMaxArea(30);
		plan.setPlanMinArea(10);
		plan.setPlanName("只是测试一下");
		plan.setPlanPicPath("1.jpg");*/
	//	int ok = PlanInstance.addPlan(plan);
	//	System.out.println("ok-->"+ ok);
	}
}
