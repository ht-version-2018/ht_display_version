package com.ht.service;

import java.sql.SQLException;
import java.util.List;

import com.ht.model.New;

public interface NewService_Admin {
	
	List<New> getNewList(int page) throws SQLException;
	
	int getNewNum() throws SQLException;
	
	int deleteNew(int newId) throws SQLException;
}
