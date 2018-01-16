package com.ht.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.NewDao_Admin;
import com.ht.model.News;
import com.ht.service.NewService_Admin;

@Service("NewService")
public class NewServiceImpl_Admin implements NewService_Admin{
	
	@Autowired
	private NewDao_Admin newDao;
	
	/*@Override
	public List<News> getNewList(int page) throws SQLException{
		return newDao.getNewList(page);
	}*/

	@Override
	public int getNewNum() throws SQLException {
		return newDao.getNewNum();
	}

	@Override
	public int deleteNew(int newId) throws SQLException {
		return newDao.deleteNew(newId);
	}

	@Override
	public List<News> getNewList(int page) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
