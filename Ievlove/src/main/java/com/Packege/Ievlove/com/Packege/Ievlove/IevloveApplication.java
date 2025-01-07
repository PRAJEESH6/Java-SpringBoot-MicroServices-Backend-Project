package com.Packege.Ievlove.com.Packege.Ievlove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IevloveApplication {

	public static void main(String[] args) {
		SpringApplication.run(IevloveApplication.class, args);
		System.out.println("Welcome Prajeesh");
		}

}
