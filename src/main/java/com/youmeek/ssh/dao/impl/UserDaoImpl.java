package com.youmeek.ssh.dao.impl;

import com.youmeek.ssh.dao.UserDaoI;
import com.youmeek.ssh.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by judasn on 2014/4/3.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDaoI {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	//2014年4月4日 00:15:20直接只使用@Autowired,这里提示sessionFactory没办法注入，必须再加上@Qualifier
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public Serializable saveUser(User user) {
		return this.getCurrentSession().save(user);
	}

	@Override
	public User getUser(String userId) {
		return (User) this.getCurrentSession().get(User.class, userId);
	}
}
