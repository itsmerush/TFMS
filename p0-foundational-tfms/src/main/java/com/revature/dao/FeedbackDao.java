package com.revature.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.revature.model.Feedback;
import com.revature.model.Trainer;

public interface FeedbackDao {
	
	
	public void setFeedback();
	
	
	public void showFeedback();
	
	public void showFeedbackTrainer(String username);


	public int addFeedbackforTesting(List<Feedback> feedbackList);


	public int getFeedbackAvg(String string);
	
	
}
