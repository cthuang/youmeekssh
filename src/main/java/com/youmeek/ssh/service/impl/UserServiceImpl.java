package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.dao.UserDaoI;
import com.youmeek.ssh.model.User;
import com.youmeek.ssh.service.UserServiceI;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author Judas.n 2014年4月6日 22:49:19
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	private UserDaoI userDaoI;

	public UserDaoI getUserDaoI() {
		return userDaoI;
	}

	@Autowired
	public void setUserDaoI(UserDaoI userDaoI) {
		this.userDaoI = userDaoI;
	}

	@Override
	public void springTest() {
		logger.info("spring配置测试");
	}

	@Override
	public Serializable saveUser(User user) {
		return userDaoI.saveUser(user);
	}

	@Override
	public User getUser(String userId) {
		return userDaoI.getUser(userId);
	}
}
