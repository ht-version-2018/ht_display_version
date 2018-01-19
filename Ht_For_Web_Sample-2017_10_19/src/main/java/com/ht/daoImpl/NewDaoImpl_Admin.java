package com.ht.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ht.dao.NewDao_Admin;
import com.ht.model.News;
import com.ht.model.Plan;

@Repository
public class NewDaoImpl_Admin implements NewDao_Admin{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<News> getNewList(Integer page,String searchInfo) throws SQLException{
		String sql = new String();
		if(searchInfo==null || searchInfo.trim().equals("")){
			sql = "select newId,newTitle,createTime,author,newStatus from news order by newId desc limit "+(page-1)*10+",10";
		}else{
			sql = "select newId,newTitle,createTime,author,newStatus from news where newTitle like '%"+ searchInfo +"%' order by newId desc limit "+(page-1)*10+",10";
		}
		List<News> newList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(News.class));
		return newList;
	}

	@Override
	public int getNewNum(String searchInfo) throws SQLException {
		String sql = new String();
		if(searchInfo==null || searchInfo.trim().equals("")){
		   sql = "select count(*) from news";
		}else{
			sql = "select count(*) from news where newTitle like '%" + searchInfo + "%'";
		}
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int delNew(Integer newId) throws SQLException{
		String sql = "delete from news where newId=?";
		return jdbcTemplate.update(sql, newId);
	}

	@Override
	public int addNew(News news) throws SQLException {
		String sql = "insert into news(newTitle,createTime,author,newContent,newStatus) values(?,?,?,?,?)";
		Object[] param = {news.getNewTitle(),news.getCreateTime(),news.getAuthor(),news.getNewContent(), 1};
		return jdbcTemplate.update(sql,param);
	}

	@Override
	public int updateNewStatus(Integer newId, Integer newStatus) throws SQLException {
		String sql = "update news set newStatus="+ newStatus+" where newId=" + newId;
		return jdbcTemplate.update(sql);
	}

	@Override
	public News getNews(Integer newsId) throws SQLException,EmptyResultDataAccessException {
		String sql = "select * from news where newId = " + newsId;
		return (News) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(News.class));
	} 
	
}
