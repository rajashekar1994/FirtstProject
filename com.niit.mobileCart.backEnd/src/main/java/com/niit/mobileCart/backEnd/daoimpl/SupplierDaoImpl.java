package com.niit.mobileCart.backEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mobileCart.backEnd.dao.SupplierDao;
import com.niit.mobileCart.backEnd.model.Supplier;



@Repository("supplierDao")
@EnableTransactionManagement

public class SupplierDaoImpl implements SupplierDao
{

	@Autowired
	public SessionFactory sessionFactory;
	public SupplierDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Supplier> list() {
		String str="from Supplier";
	Query query=sessionFactory.getCurrentSession().createQuery(str);
		return query.list();
	}

	@Transactional
	public Supplier get(String id) 
	{
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Supplier.class, id);
	}

	@Transactional
	public Supplier validate(String id, String password) 
	{//select *from user wher id='niit' and paswrd='niit'
	String str="from Supplier where id='"+id +"' and password='"+password +"'";
	Query query=sessionFactory.getCurrentSession().createQuery(str)	;
			return(Supplier) query.uniqueResult();
	}

	@Transactional
	public boolean save(Supplier supplier) 
	{
		try 
		{
			sessionFactory.getCurrentSession().save(supplier);
		} 
		catch (HibernateException e) 
		{
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean update(Supplier supplier) 
	{
		try 
		{
			sessionFactory.getCurrentSession().update(supplier);
		}
		catch (HibernateException e) 
		{	
			e.printStackTrace();
			return false;
		}
		return true;
	}

}


