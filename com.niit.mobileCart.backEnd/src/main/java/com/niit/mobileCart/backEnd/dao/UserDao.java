package com.niit.mobileCart.backEnd.dao;


import java.util.List;

import com.niit.mobileCart.backEnd.model.User;

public interface UserDao 
{
	public List<User> list();
	//gettng all of user list//
	
	public User get(String id);
	//to  gettng the id details//
	
	public User validate(String id,String password);
	//if it is true,value it will return user..else it will return null//
	
	public boolean save(User user); 
	//to save user//
	
	
	public boolean update(User user);
//to update user//

}
