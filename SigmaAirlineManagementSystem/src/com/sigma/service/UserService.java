package com.sigma.service;

import com.sigma.beans.*;
import com.sigma.dao.*;

public class UserService{
	UserDao userDao = new UserDAOArrayImplementation();
	public int addUser(User user)
	{
		userDao.addUserDetails(user);
		return 0;
	}
	public User[] getUserDetails()
	
	{
		return userDao.getUserDetails();
	}

}

