package com.waylau.spring.cloud.weather.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * WeatherReportService Test.
 * 
 * @since 1.0.0 2017年10月26日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataCollectionServiceTest {
	
	@Autowired
	private WeatherDataCollectionService weatherDataCollectionService;
	
	@Test
	public void testGetDataByCityId() {
		weatherDataCollectionService.syncDataByCityId("101280601");
	}
}
