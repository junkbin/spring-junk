package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class DemoController {

	@RequestMapping("/")
	@ResponseBody
	public String hie() {
		return "Hie";
	}
	
	
	@RequestMapping("/1")
	public String hieee() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/2")
	@ResponseBody
	public List<String> list() {
		List<String> list = new ArrayList<>();
		list.add("A");
		
		return list;
	}
	
}
