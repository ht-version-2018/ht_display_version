package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ht.model.Comp;
import com.ht.service.CompService_Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
@WebAppConfiguration("src/main/resources")

public class CompTest {
	@Autowired
	private CompService_Admin CompInstance;
	
	@Test
	public void getCompList()
	{
		List<Comp> CompList = CompInstance.getCompList();
		System.out.println("CompList" +CompList);
	}
}
