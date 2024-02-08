package com.sigma.dao;

import java.util.Arrays;

import com.sigma.beans.Carrier;
import com.sigma.beans.User;

public class UserDAOArrayImplementation implements UserDao {
	private User[] userdetails= new User[0];
	public int addUserDetails(User user)
	{
	    userdetails=Arrays.copyOf(userdetails,userdetails.length+1);
		userdetails[userdetails.length-1]=user;
		return 0;
	}

}

