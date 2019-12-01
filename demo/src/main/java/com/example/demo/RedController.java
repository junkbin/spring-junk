package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/red")
public class RedController {
	
	@RequestMapping("/")
	public String red() {
		return "Red Indexxx";
	}
	
	@RequestMapping("/1")
	public int red1() {
		return 100;
	}
	
	@RequestMapping("/2")
	public List<String> redList() {
		List<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Mumbai");
		return list;
	}
	
	
	@RequestMapping("/3")
	public Sample redUdf() {
		Sample ref = new Sample();
		ref.setName("Andhri");
		
		return ref;
	}
	
	
	@RequestMapping("/4")
	public List<Sample> redUdfList() {
		List<Sample> list = new ArrayList<>();
		Sample ref = new Sample();
		ref.setName("Andhri");
		
		list.add(ref);
		
		return list;
	}
}
