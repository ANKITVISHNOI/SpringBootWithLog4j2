package com.avssoftsol;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExample {
	
	private static Logger logger = LogManager.getLogger(SpringBootExample.class);
	
	public static void main(String[] args) {
		logger.info("Logging Stating.....");
		logger.debug("Debugging.....");
		logger.error("Error......");
		SpringApplication.run(SpringBootExample.class, args);
		System.out.println("Hello");
		
	}

}
