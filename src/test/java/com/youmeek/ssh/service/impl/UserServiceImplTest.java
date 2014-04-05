package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.model.User;
import com.youmeek.ssh.service.UserServiceI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * Created by judasn on 2014/3/28.
 */
public class UserServiceImplTest {
	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	//public void testSpringTest() throws Exception {
	//	UserServiceI userServiceI = (UserServiceI) applicationContext.getBean("userService");
	//	userServiceI.springTest();
	//}

	@Test
	public void testSaveUser() throws Exception {
		UserServiceI userServiceI = (UserServiceI) applicationContext.getBean("userService");
		User user = new User(UUID.randomUUID().toString(), "lili");
		userServiceI.saveUser(user);

	}
}
