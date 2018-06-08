package com.waylau.spring.cloud.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.cloud.weather.vo.Weather;
import com.waylau.spring.cloud.weather.vo.WeatherResponse;

/**
 * 天气预报服务.
 * 
 * @since 1.0.0 2017年11月05日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	
	@Autowired
	private WeatherDataClient weatherDataClient;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		
		// 由天气数据API微服务来提供数据
		WeatherResponse response = weatherDataClient.getDataByCityId(cityId);
		return response.getData();
	}

}
