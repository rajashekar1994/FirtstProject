package com.niit.mobileCart.backEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mobileCart.backEnd.dao.CategoryDAO;
import com.niit.mobileCart.backEnd.model.Category;

	@Repository("categoryDAO")
	@EnableTransactionManagement
	public class CategoryDAOImpl implements  CategoryDAO
	{
		@Autowired
		public SessionFactory sessionFactory;
		public CategoryDAOImpl(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		@Transactional
		public List<Category> list() {
			String str="from Category";
		Query query=sessionFactory.getCurrentSession().createQuery(str);
			return query.list();
		}

		@Transactional
		public Category get(String id) 
		{
			// TODO Auto-generated method stub
			return sessionFactory.getCurrentSession().get(Category.class, id);
		}

		@Transactional
		public Category validate(String id, String password) 
		{//select *from user wher id='niit' and paswrd='niit'
		String str="from Category where id='"+id +"' and password='"+password +"'";
		Query query=sessionFactory.getCurrentSession().createQuery(str)	;
				return(Category)query.uniqueResult();
		}

		@Transactional
		public boolean save(Category category) 
		{
			try 
			{
				sessionFactory.getCurrentSession().save(category);
			} 
			catch (HibernateException e) 
			{
				
				e.printStackTrace();
				return false;
			}
			return true;
		}

		@Transactional
		public boolean update(Category category) 
		{
			try 
			{
				sessionFactory.getCurrentSession().update(category);
			}
			catch (HibernateException e) 
			{	
				e.printStackTrace();
				return false;
			}
			return true;
		}

		

	}



