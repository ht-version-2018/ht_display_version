package com.ht.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.CompDao_Admin;
import com.ht.model.Comp;
import com.ht.service.CompService_Admin;

@Service("CompService")
public class CompServiceImpl_Admin implements CompService_Admin{
	
	@Autowired
	private CompDao_Admin compDao;

	@Override
	public List<Comp> getCompList() {
		// TODO Auto-generated method stub
		
		return compDao.getCompList();
	}
	

}
