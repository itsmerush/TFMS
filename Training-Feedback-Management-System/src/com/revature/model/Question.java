package com.revature.model;

public class Question {
	String questionId;
	String questionSection;
	String questionText;
	
	
	
	public Question() {
		super();
	}



	public Question(String questionId, String questionSection, String questionText) {
		super();
		this.questionId = questionId;
		this.questionSection = questionSection;
		this.questionText = questionText;
	}



	public String getQuestionId() {
		return questionId;
	}



	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}



	public String getQuestionSection() {
		return questionSection;
	}



	public void setQuestionSection(String questionSection) {
		this.questionSection = questionSection;
	}



	public String getQuestionText() {
		return questionText;
	}



	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	
	
}