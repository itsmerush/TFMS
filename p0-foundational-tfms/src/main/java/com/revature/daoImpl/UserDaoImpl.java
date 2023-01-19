package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.revature.aplication.App;
import com.revature.dao.UserDao;
import com.revature.model.User;

public class UserDaoImpl implements UserDao{
	private static final Logger logger=Logger.getLogger(UserDaoImpl.class);
	@Override
	public boolean checkValidUser(String username, String Password) {
		// TODO Auto-generated method stub
		Connection connection=App.con;
		Statement stmt;
		try {
			stmt = connection.createStatement();
			String sql="SELECT * FROM USER";
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				if(rs.getString(1).equals(username) && rs.getString(2).equals(Password)) {
					
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public String checkUserRole(String username, String Password) {
		// TODO Auto-generated method stub
		Connection connection=App.con;
		Statement stmt;
		try {
			stmt = connection.createStatement();
			String sql="SELECT * FROM USER";
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs.getString(1).equals(username) && rs.getString(2).equals(Password)) {
					return rs.getString(3);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public User getUserForTest(User uu) {

		Connection con = null;

		con = App.con;

		try {

		java.sql.Statement stm = con.createStatement();

		ResultSet rs = stm.executeQuery("SELECT * FROM User");

		while(rs.next()) {

		if (uu.getUsername().equals(rs.getString(1)) && uu.getPassword().equals(rs.getString(2))){

		uu.setUsername(rs.getString(1));

		uu.setPassword(rs.getString(2));

		uu.setRole(rs.getString(3));

		}

		}

		}catch(SQLException e ){

		System.out.println(e.getMessage());

		}

		

		return uu;

		}

}
