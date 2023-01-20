package com.revature.service;

import java.util.HashMap;

import com.revature.model.Feedback;
import com.revature.model.Trainer;

public interface FeedbackService {
	
	public void setFeedbackInput(Feedback F,String username);

	public void showFeedbackDetailsByParameters();
	public void showFeedbackDetailsForTrainer(String username);
}
