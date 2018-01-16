package com.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ht.model.News;
import com.ht.service.NewService_Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
@WebAppConfiguration("src/main/resources")

public class NewTest {
	
	@Autowired
	private NewService_Admin newInstance;
	
	@Test
	public void getNewList() throws SQLException{
		List<News> newList = newInstance.getNewList(1);
		System.out.println("newList-->" + newList);
	}
	
	@Test
	public void deleteNew() throws SQLException{
		int isOk = newInstance.deleteNew(5);
		System.out.println("isOK-->" + isOk);
	}
}
