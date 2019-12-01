package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HelloJdbcApplication implements CommandLineRunner {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(HelloJdbcApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) {
		System.out.println("Hello JDBC");
		
		create();
		read();
		readById();
		
		this.userDao.read();
	}
	
	public void create() {
		System.out.println(this.jdbcTemplate);
		
		String sql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, "adsf", "adfda", "adfadf");
	}
	
	public void read() {
		String sql = "SELECT * FROM USER";
		List<User> list = jdbcTemplate.query(sql, new UserRowMapper());
		System.out.println(list);
	}
	
	
	public void readById() {
		String sql = "SELECT * FROM USER WHERE ID=?";
		// List<User> list = jdbcTemplate.query(sql, new UserRowMapper());
		// System.out.println(list);
		
		List<User> list = jdbcTemplate.query(sql, new Object[] {11}, new UserRowMapper());
		System.out.println(list);
		
		
		User uref =jdbcTemplate.queryForObject(sql, new Object[] {11}, new UserRowMapper());
		System.out.println(uref);
	}

}
