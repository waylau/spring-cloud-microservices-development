package com.waylau.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Config Controller.
 * 
 * @since 1.0.0 2017年12月31日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RefreshScope
@RestController
public class VersionController {
 
    private final String auther = "waylau.com";
	
	@Value("${version}")
    private String version;
	
	@RequestMapping("/config")
	public String getConfig() {
	    return auther + " " + version;
	}
}
