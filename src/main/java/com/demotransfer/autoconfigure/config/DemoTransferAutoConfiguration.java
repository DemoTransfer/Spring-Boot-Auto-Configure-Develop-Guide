package com.demotransfer.autoconfigure.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demotransfer.autoconfigure.service.DemoTransferService;

@Configuration
@ConditionalOnClass({ DemoTransferService.class })
@EnableConfigurationProperties(DemoTransferProperties.class)
public class DemoTransferAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public DemoTransferService demoTransferService() {
		return new DemoTransferService();
	}

}
