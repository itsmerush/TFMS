package com.revature.dao;

import com.revature.model.User;

public interface UserDao {
	boolean checkValidUser(String username,String Password);
	String checkUserRole(String username,String Password);
	User getUserForTest(User uu);
}
