package com.anu.user.data;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	String name="Balu";
	
	

	
	JSONObject jsonUser=new JSONObject();
	@RequestMapping("/user")
	
	
	public JSONObject getUser() 
	{
		System.out.println("inside getUser Details");
		jsonUser.put("name", "Yatham Balaiah");
		jsonUser.put("fathername", "Narsimhulu");
		jsonUser.put("address", "Nagarkurnool");
		System.out.println(jsonUser); 
		return jsonUser;  

	}

}
