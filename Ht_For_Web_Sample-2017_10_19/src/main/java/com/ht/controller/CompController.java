package com.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.model.Comp;
import com.ht.service.CompService_Admin;

@Controller
public class CompController {

	@Autowired 
	private CompService_Admin compInstance;
	
	@RequestMapping("/comp")
	@ResponseBody
	public List<Comp> getFileList(){
		List<Comp> fileList=compInstance.getCompList();
		return fileList;
	}
}
