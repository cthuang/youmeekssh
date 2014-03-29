package com.youmeek.ssh.service;

import com.youmeek.ssh.serviceI.UserServiceI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by judasn on 2014/3/28.
 */
public class UserServiceImplTest {
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSpringTest() throws Exception {
		UserServiceI userServiceI = (UserServiceI) applicationContext.getBean("userService");
		userServiceI.springTest();
	}
}
