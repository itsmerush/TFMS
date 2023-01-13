package com.revature.model;

public class Feedback extends Question{
	String traineeId;
    String trainerId;
	String questionId;
    String rating;
    
    
    
	public Feedback() {
		super();
	}



	public Feedback(String traineeId, String trainerId, String questionId, String rating) {
		super();
		this.traineeId = traineeId;
		this.trainerId = trainerId;
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



	public String getQuestionId() {
		return questionId;
	}



	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}



	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}
	
}

	
	

	
	
	
	
	