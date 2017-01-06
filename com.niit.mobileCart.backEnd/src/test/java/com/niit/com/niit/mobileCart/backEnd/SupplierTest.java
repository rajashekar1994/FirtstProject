package com.niit.com.niit.mobileCart.backEnd;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mobileCart.backEnd.dao.SupplierDao;
import com.niit.mobileCart.backEnd.model.Supplier;

public class SupplierTest {



	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		
		SupplierDao supplierDao=(SupplierDao)context.getBean("supplierDao");
		Supplier supplier=(Supplier)context.getBean("supplier");
		
		
		

		supplier.setId("200");
		supplier.setName("raj");
		supplier.setAddress("mvm");
		
	
		
		
		supplier.setId("201");
		supplier.setName("ramu");
		supplier.setAddress("kodad");
		
	 
	
	   supplierDao.save(supplier);
	

		
	
		/*List<User> u= userDao.list();
		for(User m: u)
			System.out.println(m.getId()+" \t"+m.getName()+"\t"+m.getMobile()+"\t"+m.getPassword());*/
		//supplierDao.save(supplier);
		
		//userDao.update(user);
	
	}

		
	}


		



