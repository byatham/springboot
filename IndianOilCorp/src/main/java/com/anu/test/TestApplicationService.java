package com.anu.test;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.apache.coyote.Response;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;

@SpringBootApplication

public class TestApplicationService { 

	public static void main(String[] args) {
System.out.println("Hello ...Your TestApplicationService has been started >>>>>");
SpringApplication.run(TestApplicationService.class, args);
System.out.println("Hello ...Your TestApplicationService has been Initialized >>>>>");
System.out.println("Hello ...Your TestApplicationService has been Initialized 45563>>>>>");

	}

@Bean
public CommandLineRunner commandLineRunner(org.springframework.context.ApplicationContext ctx) {
	return args -> {

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

	};



	}

	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); }
	 * 
	 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
	 * Exception { return args -> { Response employee = restTemplate.getForObject(
	 * "http://dummy.restapiexample.com/api/v1/employees", Response.class);
	 * System.out.println(employee.toString()); }; }
	 */

}
