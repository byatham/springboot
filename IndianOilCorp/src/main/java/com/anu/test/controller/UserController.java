package com.anu.test.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	JSONObject jsobj=new JSONObject();
	RestTemplate restTemplate=new RestTemplate();

	@RequestMapping("/data")
	public JSONObject getData()
	{
		System.out.println("inside getData()");
		jsobj=restTemplate.getForObject("http://localhost:8080/user", JSONObject.class);
		System.out.println("response from server >>>>>>>>>>>>>>> *****"+jsobj);
		return jsobj; 
		
	}
	

}
