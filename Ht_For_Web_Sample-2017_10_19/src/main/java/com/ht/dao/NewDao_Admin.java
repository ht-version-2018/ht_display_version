package com.ht.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;

import com.ht.model.News;

public interface NewDao_Admin {
	
	List<News> getNewList(Integer page,String searchInfo) throws SQLException;
	
	int getNewNum(String searchInfo) throws SQLException;
	
	int delNew(Integer newId) throws SQLException;
	
	int updateNewStatus(Integer newId, Integer newStatus) throws SQLException;
	//Ìí¼ÓÐÂÎÅ
	int addNew(News newEntity) throws SQLException;
	
	News getNews(Integer newsId) throws SQLException,EmptyResultDataAccessException;
}
