package com.revature.aplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;
import com.revature.dao.FeedbackDao;
import com.revature.dao.TrainerDao;
import com.revature.dao.UserDao;
import com.revature.daoImpl.FeedbackDaoImpl;
import com.revature.daoImpl.TrainerDaoImpl;
import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.QuestionManagement;
import com.revature.util.QuestionsSection;


public class App {
	private static final Logger logger=Logger.getLogger(App.class);
	public static List<QuestionManagement>QuestionList=new ArrayList<>();
	public static Connection con=DatabaseConnection.getConnection();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//usingResourceBundle();
		//Connection con=DatabaseConnection.getConnection();
		logger.info("\n**********Welcome to Training Feedback Management System**********");
		logger.info("\nEnter username");
		String username=sc.nextLine();
		logger.info("Enter Password");
		String password=sc.nextLine();
		String role="";
		UserDao u=new UserDaoImpl();
		if(u.checkValidUser(username, password)) {
			role=u.checkUserRole(username, password);
		}
		
		FeedbackDao feedbackObj=new FeedbackDaoImpl();
		
		if(role.equals("ADMIN")) {
			feedbackObj.showFeedback();
		}else if(role.equals("ASSOCIATE")) {
			feedbackObj.setFeedback();
		}else if(role.equals("TRAINER")) {
			feedbackObj.showFeedbackTrainer(username);
		}
		
		
		
	
	}

	private static void usingResourceBundle() {
		// TODO Auto-generated method stub
		ResourceBundle resourceBundle=ResourceBundle.getBundle("tfms");
		String dburl=resourceBundle.getString("dburl");
		String driver=resourceBundle.getString("driver");
		String username=resourceBundle.getString("username");
		String password=resourceBundle.getString("password");
		logger.info("dburl "+ dburl);
		logger.info("driver "+ driver);
		logger.info("username "+ username);
		logger.info("password "+ password);
		
	}
	
	private static void usingPropertiesClassStatic() {
		Properties prop=new Properties();
		try(InputStream inputstream=App.class.getClassLoader().getResourceAsStream("tfms.properties");)
			{
				prop.load(inputstream);
			
		}catch (IOException  e) {
			e.printStackTrace();
		}
		
		logger.info("dburl "+ prop.getProperty("dburl"));
		logger.info("driver "+ prop.getProperty("driver"));
		logger.info("username "+ prop.getProperty("username"));
		logger.info("password "+ prop.getProperty("password"));
	}
	
	
	private static void usingPropertiesClassNonStatic() {
		Properties prop=new Properties();
		try(InputStream inputstream=App.class.getClassLoader().getResourceAsStream("tfms.properties");)
		{
			prop.load(inputstream);
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.info("dburl "+ prop.getProperty("dburl"));
		logger.info("driver "+ prop.getProperty("driver"));
		logger.info("username "+ prop.getProperty("username"));
		logger.info("password "+ prop.getProperty("password"));
	}

}
