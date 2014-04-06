package com.youmeek.ssh.service;

import com.youmeek.ssh.model.User;

import java.io.Serializable;

/**
 * @author Judas.n 2014年4月6日 22:49:26
 */
public interface UserServiceI {

	public Serializable saveUser(User user);

	public User getUser(String userId);
	
}
