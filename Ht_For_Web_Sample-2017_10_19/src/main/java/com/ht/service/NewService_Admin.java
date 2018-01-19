package com.ht.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.ht.model.News;

public interface NewService_Admin {
	
	List<News> getNewList(Integer page,String searchInfo) throws SQLException;
	
	int getNewNum(String searchInfo) throws SQLException;
	
	int delNew(Integer newId) throws SQLException;
	
	int addNew(News news) throws SQLException;
	
	int updateNewStatus(Integer newsId, Integer newStatus) throws SQLException;
	
	News getNews(Integer newsId) throws SQLException,EmptyResultDataAccessException;
}
