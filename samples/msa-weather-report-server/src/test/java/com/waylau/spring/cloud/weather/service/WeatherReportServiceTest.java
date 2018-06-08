package com.waylau.spring.cloud.weather.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.waylau.spring.cloud.weather.vo.Weather;

/**
 * WeatherReportService Test.
 * 
 * @since 1.0.0 2017年10月26日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherReportServiceTest {
	
	@Autowired
	private WeatherReportService weatherReportService;
	
	@Test
	public void testGetDataByCityId() {
		Weather weather = weatherReportService.getDataByCityId("101280601");
		
		assertEquals("Get Data By City Id", "深圳",  weather.getCity());
		
	}
}
