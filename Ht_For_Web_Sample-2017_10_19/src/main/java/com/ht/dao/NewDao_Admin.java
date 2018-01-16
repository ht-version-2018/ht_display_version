package com.ht.dao;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.News;

public interface NewDao_Admin {
	
	List<News> getNewList(int page) throws SQLException;
	
	int getNewNum() throws SQLException;
	
	int deleteNew(int newId) throws SQLException;
	
	//Ìí¼ÓÐÂÎÅ
	int addNew(News newEntity) throws SQLException;
}
