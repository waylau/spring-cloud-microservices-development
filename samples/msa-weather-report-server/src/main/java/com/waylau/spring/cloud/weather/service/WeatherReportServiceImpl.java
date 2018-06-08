package com.waylau.spring.cloud.weather.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.waylau.spring.cloud.weather.vo.Forecast;
import com.waylau.spring.cloud.weather.vo.Weather;

/**
 * 天气预报服务.
 * 
 * @since 1.0.0 2017年10月25日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

	@Override
	public Weather getDataByCityId(String cityId) {
		// TODO 改为由天气数据API微服务来提供数据
		
		Weather data = new Weather();
		data.setAqi("81");
		data.setCity("深圳");
		data.setGanmao("各项气象条件适宜，无明显降温过程，发生感冒机率较低。");
		data.setWendu("22");
		
		List<Forecast> forecastList = new ArrayList<>();
		
		Forecast forecast =new Forecast();
		forecast.setDate("29日星期天");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风向");
		forecast.setHigh("高温 27℃");
		forecast.setLow("低温 20℃");
		forecastList.add(forecast);
		
		forecast =new Forecast();
		forecast.setDate("29日星期天");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风向");
		forecast.setHigh("高温 27℃");
		forecast.setLow("低温 20℃");
		forecastList.add(forecast);
		
		forecast =new Forecast();
		forecast.setDate("30日星期一");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风向");
		forecast.setHigh("高温 27℃");
		forecast.setLow("低温 20℃");
		forecastList.add(forecast);
		
		forecast =new Forecast();
		forecast.setDate("31日星期二");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风向");
		forecast.setHigh("高温 27℃");
		forecast.setLow("低温 20℃");
		forecastList.add(forecast);
		
		forecast =new Forecast();
		forecast.setDate("1日星期三");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风向");
		forecast.setHigh("高温 27℃");
		forecast.setLow("低温 20℃");
		forecastList.add(forecast);
		
		forecast =new Forecast();
		forecast.setDate("2日星期四");
		forecast.setType("多云");
		forecast.setFengxiang("无持续风向");
		forecast.setHigh("高温 27℃");
		forecast.setLow("低温 20℃");
		forecastList.add(forecast);
		
		data.setForecast(forecastList);
		return data;
	}

}
