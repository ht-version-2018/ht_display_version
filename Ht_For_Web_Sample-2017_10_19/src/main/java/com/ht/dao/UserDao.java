package com.ht.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.ht.model.User;

public interface UserDao {
		
	public boolean Register(User user) throws SQLException;
	
	public List<User> getUserList(Integer page,String searchInfo) throws SQLException;
	
	public User getUser(Integer userId) throws SQLException,EmptyResultDataAccessException;
	
	public boolean delUser(Integer userId) throws SQLException;
	
	public boolean updateUser(User user) throws SQLException;
	
	public int getUserNum(String searchInfo) throws SQLException;
	
}
