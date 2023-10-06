package com.gl.sms.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.gl.sms.model.Login;

@Repository
@EnableTransactionManagement
public class LoginDao {
	
	Login login;
	

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	
	public LoginDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	public LoginDao() {
		super();
		login = new Login(1,"student","password");
	}

	public LoginDao(Login login) {
		super();
		this.login = login;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	public Login getLoginObject()
	{
		return this.login;
	}
	
	public boolean validateLogin(Login login)
	{
		if(this.login.getUserName().equals(login.getUserName())
				&& (this.login.getPassword().equals(login.getPassword())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Transactional
	public List <Login> getLoginDao() {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
				List <Login> logins = session.createQuery("from Login").list();
		tx.commit();
		return logins;
	}

	
	@Transactional
	public Login getLoginByIdDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
			Login login  = session.get(Login.class, id);
		tx.commit();
		return login;
	}


	@Transactional
	public void deleteLoginDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Login login  = session.get(Login.class, id);
		session.delete(login);
		tx.commit();
		
	}

	@Transactional
	public void saveLoginDao(Login login) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		session.save(login);
		tx.commit();
		
	}
}
