package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloConroller {

	@RequestMapping("/1")
	@ResponseBody
	public String sayHello() {
		return "Hello";
	}
	
	
	
	
	@RequestMapping("/2")
	public String sayHelloJSP() {
		
		return "index.jsp";
	}
	
	
	
	@RequestMapping("/3")
	public ModelAndView sayHelloJSPView() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("NAME", "ANDHERIIIIIII");
		mv.setViewName("index.jsp");

		return mv;
	}
	
	
}
