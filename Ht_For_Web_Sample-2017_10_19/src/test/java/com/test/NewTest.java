package com.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
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
	
	/*@Test
	public void getNewList() throws SQLException{
		List<News> newList = newInstance.getNewList(1,"Å®");
		System.out.println("newList-->" + newList);
	}
	
	@Test
	public void getNewNum() throws SQLException{
		System.out.println("newNum-->" + newInstance.getNewNum(null));
	}
	@Test
	public void deleteNew() throws SQLException{
		int isOk = newInstance.delNew(5);
		System.out.println("delNew-->" + isOk);
	}
	
	@Test
	public void addNews() throws SQLException{
		News news = new News();
		news.setAuthor("zs");
		news.setCreateTime("2018-01-15");
		news.setNewTitle("À²À²À²À²À²");
		news.setNewStatus(1);
		news.setNewContent("Äþ²¨ÑÅ¸ê¶û¶¯ÎïÔ°ÀÏ»¢Ò§ÈË");
		int isOk = newInstance.addNew(news);
		System.out.println("addNews-->" + isOk);
	}*/
	
	/*@Test
	public void updateNews() throws SQLException{
		System.out.println("update-->" + newInstance.updateNewStatus(1, 1));
	}*/
	
	@Test
	public void getNews(){
		try {
			System.out.println("getNew-->" + newInstance.getNews(1));
		} catch (EmptyResultDataAccessException | SQLException e) {
			e.printStackTrace();
		}
	}
}
