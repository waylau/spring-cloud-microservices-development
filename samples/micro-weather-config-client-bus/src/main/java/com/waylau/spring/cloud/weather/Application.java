package com.waylau.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主应用程序.
 * 
 * @since 1.0.0 2017年11月01日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@SpringBootApplication
@EnableDiscoveryClient
@RemoteApplicationEventScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
