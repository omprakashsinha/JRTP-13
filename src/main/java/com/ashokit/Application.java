package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService service = context.getBean(UserService.class);
		
		service.printUsername(102);
	
		
	}
	
	public void DisplayMessage()
	{
		
		//making changes for 8 AM task 
	}

}
