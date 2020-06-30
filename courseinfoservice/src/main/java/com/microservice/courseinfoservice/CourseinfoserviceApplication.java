package com.microservice.courseinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseinfoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseinfoserviceApplication.class, args);
	}

}
