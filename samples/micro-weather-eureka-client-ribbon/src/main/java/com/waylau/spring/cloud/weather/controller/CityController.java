package com.waylau.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * City Controller.
 * 
 * @since 1.0.0 2017年11月03日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
public class CityController {

    @Autowired
    private RestTemplate restTemplate;
    
	@GetMapping("/cities")
	public String listCity() {
		// 通过应用名词来查找
		String body = restTemplate.getForEntity("http://msa-weather-city-eureka/cities", String.class).getBody();
	    return body;
	}

}
