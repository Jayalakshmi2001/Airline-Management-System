package com.sigma.dao;

import java.util.Arrays;

import com.sigma.beans.*;

public class UserDAOArrayImplementation implements UserDao {
	private static User[] userdetails= new User[0];
	public User[] getUserArray()
	{
		return userdetails;
	}
	public int addUserDetails(User user)
	{
	    userdetails=Arrays.copyOf(userdetails,userdetails.length+1);
		userdetails[userdetails.length-1]=user;
		return 0;
	}
	@Override
	public User[] getUserDetails() {
		// TODO Auto-generated method stub
		return userdetails;
	}

}

