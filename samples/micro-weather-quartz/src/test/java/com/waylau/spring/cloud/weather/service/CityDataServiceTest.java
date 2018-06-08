package com.waylau.spring.cloud.weather.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * HelloController Test.
 * 
 * @since 1.0.0 2017年9月27日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityDataServiceTest {

	@Autowired
	private CityDataService cityDataServiceImpl;

	@Test
	public void testListCity() throws Exception {
		cityDataServiceImpl.listCity();
	}
}