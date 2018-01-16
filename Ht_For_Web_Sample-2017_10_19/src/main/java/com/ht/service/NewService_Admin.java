package com.ht.service;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.News;

public interface NewService_Admin {
	
	List<News> getNewList(int page) throws SQLException;
	
	int getNewNum() throws SQLException;
	
	int deleteNew(int newId) throws SQLException;
}
