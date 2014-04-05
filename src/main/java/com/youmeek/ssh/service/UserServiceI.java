package com.youmeek.ssh.service;

import com.youmeek.ssh.model.User;

import java.io.Serializable;

/**
 * Created by judasn on 2014/3/28.
 */
public interface UserServiceI {
	void springTest();

	public Serializable saveUser(User user);
	
}
