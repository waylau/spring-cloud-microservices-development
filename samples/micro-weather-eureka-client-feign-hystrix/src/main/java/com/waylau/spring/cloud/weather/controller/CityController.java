package com.waylau.spring.cloud.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.waylau.spring.cloud.weather.service.CityClient;

/**
 * City Controller.
 * 
 * @since 1.0.0 2017年11月04日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
public class CityController {

	@Autowired
	private CityClient cityClient;

	@GetMapping("/cities")
	@HystrixCommand(fallbackMethod = "defaultCities")
	public String listCity() {
		// 通过Feign客户端来查找
		String body = cityClient.listCity();
		return body;
	}

	/**
	 * 自定义断路器默认返回的内容
	 * @return
	 */
	public String defaultCities() {
        return "城市数据API服务暂时不可用！";
    }
}
