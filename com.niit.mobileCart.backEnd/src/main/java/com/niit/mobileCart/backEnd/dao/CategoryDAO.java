package com.niit.mobileCart.backEnd.dao;

import java.util.List;

import com.niit.mobileCart.backEnd.model.Category;
import com.niit.mobileCart.backEnd.model.User;

public interface CategoryDAO 
{

		public List<Category> list();
		//gettng all of user list//
		
		public Category get(String id);
		//to  gettng the id details//
		
		public Category validate(String id,String password);
		//if it is true,value it will return user..else it will return null//
		
		public boolean save(Category category); 
		//to save user//
		
		
		public boolean update(Category category);
	//to update user//

}
