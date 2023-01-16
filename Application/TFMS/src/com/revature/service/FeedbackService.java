package com.revature.service;

import java.util.HashMap;

import com.revature.model.Feedback;
import com.revature.model.Trainer;

public interface FeedbackService {
	public HashMap<String, Integer[]> setFeedbackInput(Feedback F);
}
