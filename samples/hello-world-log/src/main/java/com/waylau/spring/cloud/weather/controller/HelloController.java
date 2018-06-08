package com.waylau.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello Controller.
 * 
 * @since 1.0.0 2017年12月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public String hello() {
		logger.info("hello world");
	    return "Hello World! Welcome to visit waylau.com!";
	}

}
