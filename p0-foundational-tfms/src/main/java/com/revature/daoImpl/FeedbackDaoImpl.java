package com.revature.daoImpl;

import java.util.HashMap;

import com.revature.dao.FeedbackDao;
import com.revature.model.Feedback;
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

}
