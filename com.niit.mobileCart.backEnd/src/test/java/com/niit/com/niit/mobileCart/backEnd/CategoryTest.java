package com.niit.com.niit.mobileCart.backEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mobileCart.backEnd.dao.CategoryDAO;
import com.niit.mobileCart.backEnd.model.Category;

public class CategoryTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");

		category.setId("88");
		category.setName("sony");
		category.setDescription("male");

		category.setId("89");
		category.setName("mobile");
		category.setDescription("nokia");
		/*
		 * List<User> u= userDao.list(); for(User m: u)
		 * System.out.println(m.getId()+" \t"
		 * +m.getName()+"\t"+m.getMobile()+"\t"+m.getPassword());
		 */
		
		
		categoryDAO.save(category);

		// userDao.update(user);
		//categoryDAO.update(category);

	}

}
