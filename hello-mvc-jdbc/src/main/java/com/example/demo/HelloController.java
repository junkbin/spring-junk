package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/")
	public List sayHello() {
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM USER");
		
		
		return list;
	}
	
	
	@RequestMapping("/1")
	public List sayHelloo() {
		
		return this.userDao.readAll();
	}
	
	@RequestMapping("/2")
	public ModelAndView hieee() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		
		return mv;
	}
	
	
}
