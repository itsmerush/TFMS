package com.revature.model;

public class Associate extends Feedback {
	private String traineeName;
	private String traineeId;
	private String track;
	private String qualification;
	private String trainerId;
	
	
	
	public Associate() {
		super();
	}



	public Associate(String traineeName, String traineeId, String track, String qualification, String trainerId) {
		super();
		this.traineeName = traineeName;
		this.traineeId = traineeId;
		this.track = track;
		this.qualification = qualification;
		this.trainerId = trainerId;
	}



	public String getTraineeName() {
		return traineeName;
	}



	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}



	public String getTraineeId() {
		return traineeId;
	}



	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}



	public String getTrack() {
		return track;
	}



	public void setTrack(String track) {
		this.track = track;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getTrainerId() {
		return trainerId;
	}



	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	
	

	
}
