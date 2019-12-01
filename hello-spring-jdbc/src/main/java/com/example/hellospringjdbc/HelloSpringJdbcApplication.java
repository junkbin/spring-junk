package com.example.hellospringjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringJdbcApplication implements CommandLineRunner {
	
	@Autowired
	public  SampleDao sampleDao;

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(this.sampleDao);
		
		this.sampleDao.update();
	}
	
	

}
