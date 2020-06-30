package com.microservice.courseratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseratingdataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseratingdataserviceApplication.class, args);
	}

}
