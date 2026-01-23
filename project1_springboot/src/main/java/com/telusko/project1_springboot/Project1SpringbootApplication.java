package com.telusko.project1_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project1SpringbootApplication {

	public static void main(String[] args) {
		//creates container for you
		ApplicationContext context=SpringApplication.run(Project1SpringbootApplication.class, args);

		Developer obj = context.getBean(Developer.class);
		Laptop obj1 = context.getBean(Laptop.class);

		obj.build();
	}
}














































