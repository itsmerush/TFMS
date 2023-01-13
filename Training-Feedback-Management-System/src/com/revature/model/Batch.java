package com.revature.model;

public class Batch extends Trainer{
	String topicName;
	String trainerId;
	String traineeId ;
    String startDate;
    String endDate;
    
    
    
	public Batch() {
		super();
	}



	public Batch(String topicName, String trainerId, String traineeId, String startDate, String endDate) {
		super();
		this.topicName = topicName;
		this.trainerId = trainerId;
		this.traineeId = traineeId;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	public String getTopicName() {
		return topicName;
	}



	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}



	public String getTrainerId() {
		return trainerId;
	}



	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}



	public String getTraineeId() {
		return traineeId;
	}



	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

}
