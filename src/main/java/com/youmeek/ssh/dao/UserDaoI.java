package com.youmeek.ssh.dao;

import com.youmeek.ssh.model.User;

import java.io.Serializable;

/**
 * @author Judas.n 2014年4月6日 22:49:12
 */
public interface UserDaoI {
	public Serializable saveUser(User user);
	public User getUser(String userId);
}
