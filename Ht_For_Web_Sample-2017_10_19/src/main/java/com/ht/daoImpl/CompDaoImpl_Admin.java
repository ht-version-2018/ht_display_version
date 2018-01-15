package com.ht.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ht.dao.CompDao_Admin;
import com.ht.model.Comp;

@Repository
public class CompDaoImpl_Admin implements CompDao_Admin{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public List<Comp> getCompList() {
		String sql="select * from comp";
		List<Comp> CompList =jdbcTemplate.query(sql, new BeanPropertyRowMapper(Comp.class));
		return CompList;
	}

}
