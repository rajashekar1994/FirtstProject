package com.niit.mobileCart.backEnd.dao;

import java.util.List;

import com.niit.mobileCart.backEnd.model.Supplier;
import com.niit.mobileCart.backEnd.model.User;

public interface SupplierDao 
{
	public List<Supplier> list();
	//gettng all of user list//
	
	public Supplier get(String id);
	//to  gettng the id details//
	
	public Supplier validate(String id,String password);
	//if it is true,value it will return user..else it will return null//
	
	public boolean save(Supplier supplier); 
	//to save user//
	
	
	public boolean update(Supplier supplier);
//to update user//

}
