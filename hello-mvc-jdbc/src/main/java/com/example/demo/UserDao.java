package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List readAll() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM USER");

		return list;
	}

}
