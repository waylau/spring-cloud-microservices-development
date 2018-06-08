package com.waylau.spring.cloud.weather.service;

/**
 * 天气数据采集服务.
 * 
 * @since 1.0.0 2017年10月29日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface WeatherDataCollectionService {
	
	/**
	 * 根据城市ID同步天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	void syncDataByCityId(String cityId);

}
