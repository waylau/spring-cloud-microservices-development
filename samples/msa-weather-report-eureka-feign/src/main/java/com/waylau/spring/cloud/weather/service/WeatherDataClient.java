package com.waylau.spring.cloud.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.waylau.spring.cloud.weather.vo.WeatherResponse;

/**
 * 访问天气数据的客户端.
 * 
 * @since 1.0.0 2017年11月5日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@FeignClient("msa-weather-data-eureka")
public interface WeatherDataClient {

	/**
	 * 根据城市ID查询天气数据
	 * 
	 * @param cityId
	 * @return
	 */	
	@GetMapping("/weather/cityId/{cityId}")
	WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
