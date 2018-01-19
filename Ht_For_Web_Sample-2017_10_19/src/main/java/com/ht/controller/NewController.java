package com.ht.controller;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.News;
import com.ht.service.NewService_Admin;

@Controller
@RequestMapping("/new")
public class NewController {
	
	@Autowired 
	private NewService_Admin newInstance;
	
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
	
	@RequestMapping("/newList")
	@ResponseBody
	public List<News> getNewList(@RequestParam Integer page, @RequestParam String searchInfo){
		List<News> newList;
		System.out.println("page-->" + page);
		System.out.println("searchInfo-->" + searchInfo);
		try {
			newList = newInstance.getNewList(page,searchInfo);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return newList;
	}
	
	@RequestMapping("/newNum")
	@ResponseBody
	public int getNewNum(@RequestParam String searchInfo) throws SQLException{
		int newNum = newInstance.getNewNum(searchInfo);
		return newNum;
	}
	
	@RequestMapping("/delNew")
	@ResponseBody
	public int deleteNew(@RequestParam Integer newId) throws SQLException{
		int isOk = newInstance.delNew(newId);
		return isOk;
	}
	
	@RequestMapping("/addNew")
	@ResponseBody
	public boolean addNew(HttpServletRequest request) throws SQLException, UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		News news = new News();
		//System.out.println("newTitle-->" + newTitle);
		System.out.println("content-->" + request.getParameter("myContent"));
		System.out.println("author-->" + request.getParameter("author"));
		System.out.println("newTitle-->" + request.getParameter("newTitle"));
		
		news.setAuthor(request.getParameter("author"));
		news.setNewTitle(request.getParameter("newTitle"));
		news.setNewContent(request.getParameter("myContent"));
		news.setCreateTime(sdf.format(date));
		/*news.setAuthor(author);
		news.setCreateTime(sdf.format(date));
		news.setNewTitle(newTitle);
		news.setNewContent(content);*/
		System.out.println("new-->" + news);
		int isOk = newInstance.addNew(news);
		return isOk>0;
	}
	
	@RequestMapping("/updateNewStatus")
	@ResponseBody
	public boolean updateNewStatus(@RequestParam Integer newId,@RequestParam Integer newStatus){
		int isOk = 1;
		try {
			isOk = newInstance.updateNewStatus(newId, newStatus);
		} catch (SQLException e) {
			e.printStackTrace();
			isOk=0;
		}
		return isOk>0;
	}
	
	@RequestMapping("/getNew")
	public void getNews(@RequestParam Integer newId,HttpServletRequest request){
		News news = new News();
		try {
		    news = newInstance.getNews(newId);
		    request.setAttribute("news", news);
		} catch (EmptyResultDataAccessException | SQLException e) {
			e.printStackTrace();
		}
	//	return news;
	}
	
}
