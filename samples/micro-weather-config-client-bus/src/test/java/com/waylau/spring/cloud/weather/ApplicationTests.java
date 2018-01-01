package com.waylau.spring.cloud.weather;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 主应用测试用例.
 * 
 * @since 1.0.0 2017年11月06日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Value("${auther}")
    private String auther;
	
	@Test
	public void contextLoads() {
		assertEquals("waylau.com", auther);
	}

}
