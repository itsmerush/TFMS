package com.revature.model;

import com.revature.util.Rating;

public class Feedback extends QuestionManagement{
	String traineeId;
    String trainerId;
    String topic;
	String questionId;
    Rating rating;
    
    
    
	public Feedback() {
		super();
	}



	public Feedback(String traineeId, String trainerId,String topic, String questionId, Rating rating) {
		super();
		this.traineeId = traineeId;
		this.trainerId = trainerId;
		this.topic = topic;
		this.questionId = questionId;
		this.rating = rating;
	}



	public String getTraineeId() {
		return traineeId;
	}



	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}



	public String getTrainerId() {
		return trainerId;
	}



	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	
	public String getTopic() {
		return topic;
	}



	public void setTopic(String trainerId) {
		this.topic = trainerId;
	}



	public String getQuestionId() {
		return questionId;
	}



	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}



	public Rating getRating() {
		return rating;
	}



	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
}

	
	

	
	
	
	
	