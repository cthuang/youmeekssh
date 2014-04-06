package com.youmeek.ssh.dao;

import com.youmeek.ssh.model.User;

import java.io.Serializable;

/**
 * Created by judasn on 2014/4/3.
 */
public interface UserDaoI {
	public Serializable saveUser(User user);
	public User getUser(String userId);
}
