package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "index.jsp";
	}
	
	
	@RequestMapping("home")
	public String helloHome() {
		return "inbox.jsp";
	}
	
	@RequestMapping("inbox")
	public ModelAndView helloInbox(Sample sample, HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("ref", sample);
		mv.addObject("title", "Data Shared By Controller");
		mv.setViewName("inbox");
		
		return mv;
	}
	
	
	
}
