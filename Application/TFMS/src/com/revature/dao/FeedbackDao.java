package com.revature.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.revature.model.Feedback;
import com.revature.model.Trainer;

public interface FeedbackDao {
	//public static Map<String,Map<String,Integer>>feedbackList=new HashMap<new HashMap<>()>();
	public static HashMap<String,Integer[]> feedbackList = new HashMap<>();
	
	public void setFeedback();
	
	
	public void showFeedback();
}
