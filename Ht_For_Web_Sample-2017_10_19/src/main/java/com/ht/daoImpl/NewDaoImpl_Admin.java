package com.ht.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ht.dao.NewDao_Admin;
import com.ht.model.News;

@Repository
public class NewDaoImpl_Admin implements NewDao_Admin{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<News> getNewList(int page){
		String sql = "select * from new where newStatus=1 order by newId limit "+(page-1)*10+",10";
		 List<News> newList = null;
		try{
			newList = jdbcTemplate.query(sql,new Object[]{}, new RowMapper<News>(){
				@Override
				public News mapRow(java.sql.ResultSet rs, int index) throws SQLException {
					News newModel = new News();
					newModel.setNewId(rs.getInt("newId"));
				/*	newModel.setNewName(rs.getString("newName"));
					newModel.setNewStatus(rs.getInt("newStatus"));
					newModel.setNewTime(rs.getString("newTime"));
					newModel.setNewContent(rs.getString("newContent"));
					newModel.setNewGuiding(rs.getString("newGuiding"));
					newModel.setUserNickName(rs.getString("userNickName"));
					newModel.setViewTimes(rs.getInt("viewTimes"));*/
					return newModel;
				}
			});
		}catch(Exception e){
			System.out.println("新闻列表查询错误");
			e.printStackTrace();
		}
		return newList;
	}

	@Override
	public int getNewNum() {
		String sql = "select count(*) from news where newStatus=1";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public int deleteNew(int newId){
		String sql = "delete from new where newId=? and newStatus=1";
		return jdbcTemplate.update(sql, newId);
	}

	@Override
	public int addNew(News newEntity) throws SQLException {
		//String sql = "insert new values()"
		return 0;
	} 
	
}
