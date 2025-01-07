package com.Order_Service.Microservice_Order_Service.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientCOnfig {

	@Bean
	public WebClient.Builder webClientBuilder()
	{
		return WebClient.builder();
	}
}
