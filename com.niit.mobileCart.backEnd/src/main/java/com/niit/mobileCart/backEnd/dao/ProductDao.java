package com.niit.mobileCart.backEnd.dao;

import java.util.List;

import com.niit.mobileCart.backEnd.model.Product;

public interface ProductDao 
{
	public List<Product> list();
	//gettng all of user list//
	
	public Product get(String id);
	//to  gettng the id details//
	
	public Product validate(String id,String password);
	//if it is true,value it will return user..else it will return null//
	
	public boolean save(Product product); 
	//to save user//
	
	
	public boolean update(Product product);
//to update user//

}
