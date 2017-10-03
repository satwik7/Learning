package com.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.TreePath;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.shop.pojo.ShoppingPojo;

public class ShoppingDao {
	
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int save(ShoppingPojo sp) {
		String sql="insert into shoppinguser(fname,lname,email,password,country) values('"+sp.getFname()+"','"+sp.getLname()+"','"+sp.getEmail()+"','"+sp.getPass()+"','"+sp.getCountry()+"')";
	return jdbcTemplate.update(sql);
	}



	public List<ShoppingPojo> loginuser(String email, String pass) throws DataAccessException {
		
		String sql="select fname, email, password from shoppinguser where email=? AND password=?";
		
		List<ShoppingPojo> spdb=(List<ShoppingPojo>)jdbcTemplate.query(sql,new Object[] {email,pass},new BeanPropertyRowMapper<ShoppingPojo>(ShoppingPojo.class));
		 System.out.println(spdb);
				 return spdb;
				 
				 
				  }
		}
	
