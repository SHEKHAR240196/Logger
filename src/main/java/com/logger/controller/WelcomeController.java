package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String welcome(String name) {
		
		logger.info("Entering to the welcome " +name);
		
		logger.info("Entering to the authentication method " +name);
		//authentication
		logger.info("End to the authentication method " +name);
		
		logger.info("Entering to the service method " +name);
		//service
		logger.info("End to the service method " +name);
		
		logger.info("Entering to the validation method " +name);
		//validation
		logger.info("End to the validation method " +name);
		
		logger.info("End to the welcome " +name);
		
		return "Welcome to BikkadIt";
		
	}
	
	@GetMapping("/welcome1")
	public String welcomeTest(String name) {
		
		logger.info("Entering to the welcome " +name);
		
		logger.info("Entering to the authentication method " +name);
		//authentication
		logger.info("End to the authentication method " +name);
		
		logger.info("Entering to the service method " +name);
		//service
		logger.info("End to the service method " +name);
		
		logger.info("Entering to the validation method " +name);
		//validation
		logger.info("Entering to the validation method " +name);
		
		logger.info("End to the welcome " +name);
		
		return "Welcome to BikkadIt Pune";

}
	
	@GetMapping("/welcome2")
	public String welcomeTestOne(String name) {
		
		logger.info("Entering to the welcome " +name);
		
		logger.info("Entering to the authentication method " +name);
		//authentication
		logger.info("End to the authentication method " +name);
		
		logger.info("Entering to the service method " +name);
		//service
		logger.info("End to the service method " +name);
		
		logger.info("Entering to the validation method " +name);
		//validation
		logger.info("Entering to the validation method " +name);
		
		logger.info("End to the welcome " +name);
		
		return "Welcome to BikkadIt Pune Maharashtra";
}
	
}