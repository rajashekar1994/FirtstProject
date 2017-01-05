package com.niit.com.niit.mobileCart.backEnd;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mobileCart.backEnd.dao.CategoryDAO;
import com.niit.mobileCart.backEnd.dao.UserDao;
import com.niit.mobileCart.backEnd.model.Category;
import com.niit.mobileCart.backEnd.model.User;

import junit.framework.Assert;

public class CategoryTestCase {

	@Autowired
	static CategoryDAO categoryDAO;

	@Autowired
	static Category category;

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

		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	@Test
	public void getCategoryTestCase() 
	{
		category = categoryDAO.get("88");
		// assert statements
		Assert.assertEquals("CATEGORY Test Case", "sony", category.getName());
	}
	
	@Test
	public void getCategoryList()
	{
		List<Category> categoryList=categoryDAO.list();
		int count = categoryList.size();
		Assert.assertEquals("size", 2, count);
		
	}

}
