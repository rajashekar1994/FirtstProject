package com.niit.mobileCart.backEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity  //@Entity annotation to the Employee class which marks this class as an entity bean//

@Component //@Component annotation marks a java class as a bean 
          //so the component-scanning mechanism of spring can pick it up and pull it into the application context//



public class User 
{ 
	@Id //@Id annotation. The primary key can be a single field or a combination of  multiple fields //
	 private String id;
	 private String name;
	 private String password;
	private String mobile;
	private String role;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
