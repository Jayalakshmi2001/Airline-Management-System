package com.sigma.service;

import com.sigma.beans.Carrier;
import com.sigma.beans.User;
import com.sigma.dao.CarrierDAOArrayImplementation;
import com.sigma.dao.CarrierDao;
import com.sigma.dao.UserDao;
import com.sigma.dao.UserDAOArrayImplementation;

public class UserService{
	UserDao userDao = new UserDAOArrayImplementation();
	public int addUser(User user)
	{
		userDao.addUserDetails(user);
		return 0;
	}

}

