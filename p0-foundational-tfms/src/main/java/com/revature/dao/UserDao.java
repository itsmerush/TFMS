package com.revature.dao;

public interface UserDao {
	boolean checkValidUser(String username,String Password);
	String checkUserRole(String username,String Password);
}
