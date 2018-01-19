package com.ht.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
	public int getNewNum(String searchInfo) throws SQLException {
		return newDao.getNewNum(searchInfo);
	}

	@Override
	public int delNew(Integer newId) throws SQLException {
		return newDao.delNew(newId);
	}

	@Override
	public List<News> getNewList(Integer page,String searchInfo) throws SQLException {
		return newDao.getNewList(page,searchInfo);
	}

	@Override
	public int addNew(News news) throws SQLException {
		return newDao.addNew(news);
	}

	@Override
	public int updateNewStatus(Integer newsId, Integer newStatus) throws SQLException {
		return newDao.updateNewStatus(newsId, newStatus);
	}

	@Override
	public News getNews(Integer newsId) throws SQLException, EmptyResultDataAccessException{
		return newDao.getNews(newsId);
	}

}
