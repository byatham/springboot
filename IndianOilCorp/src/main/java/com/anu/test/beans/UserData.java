package com.anu.test.beans;

public class UserData {
	String name;  
    public String getName() {
    	System.out.println("inside getName"); 
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setName");
		this.name = name;
	}
	public String getEmail() {
		System.out.println("inside getEmail");
		return email;
	}
	public void setEmail(String email) {
		System.out.println("inside setEmail");
		this.email = email;
	}
	String email;  

}
