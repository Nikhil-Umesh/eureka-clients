package com.nikhil.eurekaclients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientsApplication.class, args);
	}

}

