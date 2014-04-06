package com.youmeek.ssh.controller;

import com.youmeek.ssh.model.User;
import com.youmeek.ssh.service.UserServiceI;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by judasn on 2014/4/6.
 */
@Controller
@RequestMapping("/front/userController/")
public class UserController {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "{id}/getUser", method = RequestMethod.GET)
	public String getUser(@PathVariable String id, HttpServletRequest request) {
		logger.info("进入getUser-Controller方法里");
		User u = userService.getUser(id);
		request.setAttribute("user", u);
		return "result";
	}
}
