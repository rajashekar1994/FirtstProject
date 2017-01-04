package com.niit.mobileCart.backEnd.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mobileCart.backEnd.dao.UserDao;
import com.niit.mobileCart.backEnd.model.User;

@Repository("userDao")
@EnableTransactionManagement
public class UserDaoImpl implements  UserDao
{
	@Autowired
	public SessionFactory sessionFactory;
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		String str="from User";
	Query query=sessionFactory.getCurrentSession().createQuery(str);
		return query.list();
	}

	@Transactional
	public User get(String id) 
	{
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Transactional
	public User validate(String id, String password) 
	{//select *from user wher id='niit' and paswrd='niit'
	String str="from User where id='"+id +"' and password='"+password +"'";
	Query query=sessionFactory.getCurrentSession().createQuery(str)	;
			return(User) query.uniqueResult();
	}

	@Transactional
	public boolean save(User user) 
	{
		try 
		{
			sessionFactory.getCurrentSession().save(user);
		} 
		catch (HibernateException e) 
		{
			
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public boolean update(User user) 
	{
		try 
		{
			sessionFactory.getCurrentSession().update(user);
		}
		catch (HibernateException e) 
		{	
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
