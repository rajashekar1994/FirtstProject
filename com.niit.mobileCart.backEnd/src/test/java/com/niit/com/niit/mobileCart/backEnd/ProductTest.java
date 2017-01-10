package com.niit.com.niit.mobileCart.backEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mobileCart.backEnd.dao.CategoryDAO;
import com.niit.mobileCart.backEnd.dao.ProductDao;
import com.niit.mobileCart.backEnd.model.Category;
import com.niit.mobileCart.backEnd.model.Product;

public class ProductTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = (Product) context.getBean("product");

		product.setId("33");
		product.setPrice(1234567);
		product.setName("wwwww");
		product.setDescription("male");
		product.setCategory_id("88");
		product.setSupplier_id("200");
		product.setStock(100);
		/*
		 * List<User> u= userDao.list(); for(User m: u)
		 * System.out.println(m.getId()+" \t"
		 * +m.getName()+"\t"+m.getMobile()+"\t"+m.getPassword());
		 */
		
		
		//productDao.save(product);
		
		productDao.update(product);

		// userDao.update(user);
		//categoryDAO.update(category);

	}





	}

