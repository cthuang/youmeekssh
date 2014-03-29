package com.youmeek.ssh.service;

import com.youmeek.ssh.serviceI.UserServiceI;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by judasn on 2014/3/28.
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Override
	public void springTest() {
		logger.info("spring配置测试");
	}
}
