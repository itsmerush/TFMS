package com.revature.daoImpl.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import com.revature.config.DatabaseConnection;
import com.revature.dao.FeedbackDao;
import com.revature.dao.UserDao;
import com.revature.daoImpl.FeedbackDaoImpl;
import com.revature.daoImpl.UserDaoImpl;
import com.revature.model.Feedback;
import com.revature.model.User;
import com.revature.util.Rating;

public class TestCases {
	@Test
	public void testGetConnection()	{
		assertNotNull(new DatabaseConnection().getConnection());
	}
	
	@Test
	public void testAverageRating() {
		FeedbackDao f=new FeedbackDaoImpl();
		int result_rating= 3;
		
		Feedback ftoBeinserted1=new Feedback("T101","A101","Junit","Q2",Rating.Agree);
		Feedback ftoBeinserted2=new Feedback("T101","A101","Junit","Q1",Rating.Neutral);
		Feedback ftoBeinserted5=new Feedback("T101","A101","Junit","Q3",Rating.StronglyAgree);
		Feedback ftoBeinserted6=new Feedback("T101","A101","Junit","Q4",Rating.StronglyDisagree);
		Feedback ftoBeinserted7=new Feedback("T101","A101","Junit","Q5",Rating.StronglyAgree);
		Feedback ftoBeinserted8=new Feedback("T101","A101","Junit","Q6",Rating.Neutral);
		Feedback ftoBeinserted3=new Feedback("T101","A101","Junit","Q7",Rating.Agree);
		Feedback ftoBeinserted4=new Feedback("T101","A101","Junit","Q8",Rating.Agree);
		List<Feedback>feedbackList=new ArrayList<>();
		feedbackList.add(ftoBeinserted1);
		feedbackList.add(ftoBeinserted2);
		feedbackList.add(ftoBeinserted3);
		feedbackList.add(ftoBeinserted4);
		feedbackList.add(ftoBeinserted5);
		feedbackList.add(ftoBeinserted6);
		feedbackList.add(ftoBeinserted7);
		feedbackList.add(ftoBeinserted8);
		
		//f.addFeedbackforTesting(feedbackList);
		int avg=f.getFeedbackAvg("JDBC");
		
		assertEquals(result_rating,avg);
		
				
		
	}
	
	@Test
	public void userAuthenticateTest() {
		UserDao userDao=new UserDaoImpl();
		User result=new User();
		User uu=new User("Rushi","abc@123","");
		result=userDao.getUserForTest(uu);
		assertEquals(result.getUsername(),uu.getUsername());
	}
	
	
	
	
}
	

	

