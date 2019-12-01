package com.example.hellospringjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SampleDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void create() {
		System.out.println(jdbcTemplate);
		
		String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, "A", "AAA", "AA@AA.com");
	}
	
	
	public void update() {
		String sql = "UPDATE USER SET USERNAME=? WHERE ID=?";
		jdbcTemplate.update(sql, "ABCD", 9);
	}

}
