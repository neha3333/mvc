package com.springonemvcone;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("loginDAO")
public class LoginDAO {
	
	
	@Autowired
	private JdbcTemplate jdbcJdbcTemplate;
	
	
	/*
	 * public boolean findAll(String login, String password) { String
	 * query="select * from user"; int flag=0; List<User>
	 * users=jdbcJdbcTemplate.query(query, new
	 * BeanPropertyRowMapper<User>(User.class)); System.out.println(users); for
	 * (User user : users) { System.out.println(user.getName());
	 * if(user.getPassword().equals(password) && user.getName().equals(login))
	 * flag=1; } if(flag==0) return false; else return true; }
	 */
	
	public boolean findAll(String login, String password)
	{
		try
		{
			String query="select * from user where name=? and password=?";
			Object[] param= {login, password};
			User users=jdbcJdbcTemplate.queryForObject(query, param, new  BeanPropertyRowMapper<User>(User.class));
			return true;
		}
		catch(EmptyResultDataAccessException e)
		{
			return false;
		}
	}
}
