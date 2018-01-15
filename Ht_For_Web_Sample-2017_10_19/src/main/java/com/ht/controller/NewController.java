package com.ht.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.New;
import com.ht.service.NewService_Admin;

@Controller
public class NewController {
	
	@Autowired 
	private NewService_Admin newInstance;
	
	@RequestMapping("/new")
	@ResponseBody
	public List<New> getNewList(@RequestParam int page) throws SQLException{
		List<New> newList = newInstance.getNewList(page);
		return newList;
	}
	
	@RequestMapping("/newNum")
	@ResponseBody
	public int getNewNum() throws SQLException{
		int newNum = newInstance.getNewNum();
		return newNum;
	}
	
	@RequestMapping("/deleteNew")
	@ResponseBody
	public int deleteNew(@RequestParam int newId) throws SQLException{
		int isOk = newInstance.deleteNew(newId);
		return isOk;
	}
}
