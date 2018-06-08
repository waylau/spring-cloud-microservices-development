/**
 * 
 */
package com.waylau.spring.cloud.weather.config;

import org.springframework.cloud.netflix.ribbon.ZonePreferenceServerListFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.PingUrl;

/**
 * 城市配置.
 *
 * @since 1.0.0 2017年11月3日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Configuration
public class RibbonConfiguration {

	@Bean
	public ZonePreferenceServerListFilter serverListFilter() {
		ZonePreferenceServerListFilter filter = new ZonePreferenceServerListFilter();
		filter.setZone("myZone");
		return filter;
	}

	@Bean
	public IPing ribbonPing() {
		return new PingUrl();
	}
}
