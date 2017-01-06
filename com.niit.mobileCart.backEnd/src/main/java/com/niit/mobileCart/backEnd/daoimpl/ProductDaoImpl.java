package com.niit.mobileCart.backEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mobileCart.backEnd.dao.ProductDao;
import com.niit.mobileCart.backEnd.model.Product;
import com.niit.mobileCart.backEnd.model.Supplier;

@Repository
@EnableTransactionManagement

public class ProductDaoImpl implements ProductDao
{
	@Autowired
	public SessionFactory sessionFactory;
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Product> list() {
		String str="from Product";
		Query query=sessionFactory.getCurrentSession().createQuery(str);
			return query.list();
	
}

	@Transactional
	public Product get(String id) 
	{
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Transactional
	public Product validate(String id, String password) 
	{//select *from user wher id='niit' and paswrd='niit'
	String str="from Product where id='"+id +"' and password='"+password +"'";
	Query query=sessionFactory.getCurrentSession().createQuery(str)	;
			return(Product) query.uniqueResult();
	}

	@Transactional
	public boolean save(Product product) 
	{
		try 
		{
			sessionFactory.getCurrentSession().save(product);
		} 
		catch (HibernateException e) 
		{
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean update(Product product) 
	{
		try 
		{
			sessionFactory.getCurrentSession().update(product);
		}
		catch (HibernateException e) 
		{	
			e.printStackTrace();
			return false;
		}
		return true;
	}

}