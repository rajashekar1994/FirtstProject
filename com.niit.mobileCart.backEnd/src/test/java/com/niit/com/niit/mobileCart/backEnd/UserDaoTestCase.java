/**
 * 
 */
package com.niit.com.niit.mobileCart.backEnd;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mobileCart.backEnd.dao.UserDao;
import com.niit.mobileCart.backEnd.model.User;

import junit.framework.Assert;

public class UserDaoTestCase 
{

	@Autowired
	static UserDao userDao;

	@Autowired
	static User user;

	@Autowired
	static AnnotationConfigApplicationContext context;

	// previosly we writeen constructor
	// but ji junit ned to write a method

	 // we can write only for static maethods//
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		user = (User) context.getBean("user");
		userDao = (UserDao) context.getBean("userDao");

	}

	@Test
	public void getUserTestCase() 
	{
		user = userDao.get("20");
		// assert statements
		Assert.assertEquals("User Test Case", "raj", user.getName());
		
	
	}
	

	}

