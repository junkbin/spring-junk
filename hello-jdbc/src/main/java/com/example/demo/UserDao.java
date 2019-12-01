package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public void read() {
		String sql = "SELECT * FROM USER";
		List<User> list = jdbcTemplate.query(sql, new UserRowMapper());
		System.out.println(list);
	}
}
