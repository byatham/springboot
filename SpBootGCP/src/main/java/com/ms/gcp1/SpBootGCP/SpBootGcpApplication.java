package com.ms.gcp1.SpBootGCP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class SpBootGcpApplication {

	public static void main(String[] args) {
		System.out.println("welcome to spboot gcp test ");
		SpringApplication.run(SpBootGcpApplication.class, args);
	}
	
	 @RequestMapping(value = "/")
	   public String success() {
		 System.out.println("APP Engine deployment success"); 
	      return "APP Engine deployment success";
	   }

}
