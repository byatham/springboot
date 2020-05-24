package com.anu.test.controller;

import org.json.simple.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anu.test.client.TestRestClient;



@RestController
public class QuoteController {
	
	JSONObject jsonObject=new JSONObject();
	
	RestTemplate restTemplate=new RestTemplate();
	TestRestClient ts=new TestRestClient(); 
	
	
	@RequestMapping("/quote")
	public JSONObject  getQuote()
	{
		System.out.println("inside 	()");
		jsonObject=restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", JSONObject.class);
		System.out.println("response from server >>>>>>>>>>>>>>> *****"+jsonObject);
			
		
		return jsonObject; 
	
	}
 
}
