package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

import com.revature.aplication.App;
import com.revature.dao.FeedbackDao;
import com.revature.model.Feedback;
import com.revature.model.QuestionManagement;
import com.revature.service.FeedbackService;
import com.revature.serviceImpl.FeedbackServiceImpl;


public class FeedbackDaoImpl implements FeedbackDao{

	@Override
	public void setFeedback() {
		// TODO Auto-generated method stub
		Feedback F=new Feedback();
		FeedbackService FB=new FeedbackServiceImpl();
		FB.setFeedbackInput(F);
		
		
		
	}

	@Override
	public void showFeedback() {
		
		// TODO Auto-generated method stub
		
		FeedbackService FB=new FeedbackServiceImpl();
		FB.showFeedbackDetailsByParameters();
		
	}

	@Override
	public int addFeedbackforTesting(List<Feedback> feedbackList) {
		// TODO Auto-generated method stub
		try {
		Connection connection=App.con;
		//logger.info("Connection Successful for feedback"); 
		for(Feedback i:feedbackList) {
			
			
			String s="";
			if(i.getRating().toString().equals("StronglyDisagree")) {
				s="1";
			}else if(i.getRating().toString().equals("Disagree")) {
				s="2";
			}else if(i.getRating().toString().equals("Neutral")) {
				s="3";
			}else if(i.getRating().toString().equals("Agree")) {
				s="4";
			}else if(i.getRating().toString().equals("StronglyAgree")) {
				s="5";
			}
			System.out.println(i.getTrainerId()+i.getTraineeId());
			
			String sql="INSERT INTO Feedback(trainer_id,trainee_id,topic,question_id,rating)VALUES(?,?,?,?,?)";
			PreparedStatement ps1=connection.prepareStatement(sql);

			System.out.println("dsvdv");
			System.out.println(s);
			ps1.setString(1, "T101");
			ps1.setString(2, i.getTraineeId().toString());
			ps1.setString(3, i.getTopic().toString());
			ps1.setString(4, i.getQuestionId().toString());
			ps1.setString(5, s);
			ps1.executeUpdate();
			
		}

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
		return 0;
	}

	@Override
	public int getFeedbackAvg(String topic) {
		// TODO Auto-generated method stub
		
		int avg=0;
		try {
			Connection connection=App.con;
			Statement stmt=connection.createStatement();
			String sql="SELECT rating FROM FEEDBACK WHERE topic=\"JDBC\"";
			
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				//System.out.println(rs.getString(avg));
				
				avg=avg+Integer.parseInt(rs.getString("rating"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		avg=avg/8;
		
		return avg;
	}

	@Override
	public void showFeedbackTrainer(String username) {
		// TODO Auto-generated method stub
		FeedbackService FB=new FeedbackServiceImpl();
		FB.showFeedbackDetailsForTrainer(username);
		
	}

}
