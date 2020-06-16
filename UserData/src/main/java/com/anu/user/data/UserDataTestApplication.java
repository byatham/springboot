package com.anu.user.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication 
public class UserDataTestApplication {

	public static void main(String[] args) {
 System.out.println("<<<<< ******* UserDataTestApplication ***** Starts >>>>>>");
 SpringApplication.run(UserDataTestApplication.class, args);
 System.out.println("<<<<< ******* UserDataTestApplication ***** Ends >>>>>>");

 
	}
	
	
	
}

