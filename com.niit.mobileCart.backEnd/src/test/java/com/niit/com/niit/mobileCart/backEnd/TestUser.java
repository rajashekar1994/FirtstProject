package com.niit.com.niit.mobileCart.backEnd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mobileCart.backEnd.dao.UserDao;
import com.niit.mobileCart.backEnd.model.User;

public class TestUser 
{
	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		
		UserDao userDao=(UserDao)context.getBean("userDao");
		User user=(User)context.getBean("user");
		
		
		user.setId(20);
		user.setName("raj");
		user.setPassword("123");
		user.setMobile("8187007009");
		user.setRole("A");
		
		
		user.setId(21);
		user.setName("ramu");
		user.setPassword("12345");
		user.setMobile("8187707009");
		user.setRole("B");
		
		List<User> u= userDao.list();
		for(User m: u)
			System.out.println(m.getId()+" \t"+m.getName()+"\t"+m.getMobile()+"\t"+m.getPassword());
		//userDao.save(user);
		
		//userDao.update(user);
	
	}

}
//@Autowired
		//UserDao userDao;
		
		//@Autowired
		//User user;
		
		//@Autowired
		//AnnotationConfigApplicationContext context;
		//public TestUser()
		//{
			//context=new AnnotationConfigApplicationContext();
			//specify in which pacajge you defined the classes->scan
			//context.scan("niit");
			//context.refresh();
			//context->bean fctory
			
			//ask context to get the instance
			//userDao=(UserDao)context.getBean("userDao");
			//user=(User)context.getBean("user");
		//}
		//public boolean validate(String id,String password)
		//{
			//if (userDao.validate(id, password)==null)
			//{
				//System.out.println("user do not exit");
				//return false;
			//}
			//else
			//{
				//System.out.println("valid credentials"); 
			//	return true;
			//}
		//}
	//public static void main(String []args)
	//{
		//UserDao d=new UserDao(); 
		//t.validate("raja","raju");
	//}
			
		
			