package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Changes for priority task no 102
		String ApplicationName;
		String bufferedReader;
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService service = context.getBean(UserService.class);
		
		service.printUsername(102);
		
		int a = 10;
		
		System.out.println(service.getClass());
	
		
	}
	
	public void DisplayMessage()
	{
		
		//making changes for 8 AM task 
		
		
	}

}
