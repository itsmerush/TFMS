package com.revature.daoImpl;

import java.util.HashMap;

import com.revature.dao.FeedbackDao;
import com.revature.model.Feedback;
import com.revature.service.FeedbackService;
import com.revature.serviceImpl.FeedbackServiceImpl;


public class FeedbackDaoImpl implements FeedbackDao{

	@Override
	public void setFeedback() {
		// TODO Auto-generated method stub
		Feedback F=new Feedback();
		FeedbackService FB=new FeedbackServiceImpl();
		HashMap<String,Integer []> l=FB.setFeedbackInput(F);
		for(String i : l.keySet()) {
			System.out.println(i+" "+l.get(i));
			feedbackList.put(i,l.get(i));
			
		}
		
	}

	@Override
	public void showFeedback() {
		
		// TODO Auto-generated method stub
		
		String []sectionArray= {"INSTRUCTOR","COURSEMATERIAL","JOBIMPACT","ENVIRONMENT","LEARNINGEFFECTIVENESS","OVERALLRATING"};
		
		
		for(String i : feedbackList.keySet()) {
			Integer[] arr=feedbackList.get(i);
			
			int itr=0;
			for(Integer x:arr) {
				System.out.println("Average for: "+sectionArray[itr]+" "+ x);
				itr++;
			}
			
		}
		
	}

}
