package com.Order_Service.Microservice_Order_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOrderServiceApplication.class, args);
	}

}
