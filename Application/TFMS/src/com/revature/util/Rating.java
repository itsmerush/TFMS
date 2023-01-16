package com.revature.util;
public enum Rating{
	StronglyDisagree(1),
	Disagree(2), 
	Neutral(3),
	Agree(4),
	StronglyAgree(5);
	
	private int intRating;

	Rating(int intRating){
		this.intRating = intRating;
	}

	public int getID(){
		return intRating;
	}
	
}
