package com.youmeek.ssh.dao;

import com.youmeek.ssh.domain.User;

import java.io.Serializable;

/**
 * Created by judasn on 2014/4/3.
 */
public interface UserDaoI {
	public Serializable saveUser(User user);
}
