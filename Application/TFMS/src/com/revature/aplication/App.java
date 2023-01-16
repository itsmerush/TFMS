package com.revature.aplication;
import com.revature.dao.FeedbackDao;
import com.revature.dao.TrainerDao;
import com.revature.daoImpl.FeedbackDaoImpl;
import com.revature.daoImpl.TrainerDaoImpl;


import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		boolean isAdmin=false;
		
		System.out.println("--------Welcome to Training Feedback Management System--------");
		System.out.println("Admin Login - Press 1");
		System.out.println("Associate Login - Press 2");
		
		int userLogin=sc.nextInt();
		sc.hasNextLine();
		
		switch(userLogin) {
			case 1:
				System.out.println("Logged in as Admin");
				isAdmin=true;
				break;
			case 2:
				System.out.println("Logged in as Associate");
				break;
			default:
				System.out.println("Please Enter Correct Option");
		
		}
		
		
		int checkAdminExitMenu=0;
		int checkAssociateExitMenu=0;
		
		if(isAdmin==true) {
			do {
				System.out.println("Add New Trainer: Press 1");
				System.out.println("Add New Associate: Press 2");
				System.out.println("Add New Batch: Press 3");
				System.out.println("Add New Feedback: Press 4");
				System.out.println("Add New Question: Press 5");
				System.out.println("Exit : 0");
				
				checkAdminExitMenu=sc.nextInt();
				sc.nextLine();
				
				switch(checkAdminExitMenu) {
				case 1:
					TrainerDao x=new TrainerDaoImpl();
					x.setTrainer();
					
					break;
				case 2:
					System.out.println("Logged in as Associate");
					break;
				
				default:
					System.out.println("Please Enter Correct Option");
			
			}
				
				
				
			}
			while(checkAdminExitMenu!=0);
		}
		else {
			do {
				System.out.println("Update Details: Press 1");
				System.out.println("Give Feedback: Press 2");
				System.out.println("Exit : 0");
				
				checkAssociateExitMenu=sc.nextInt();
				sc.nextLine();
				
				switch(checkAssociateExitMenu) {
				case 1:
					//FeedbackDao feedbackObj=new FeedbackDaoImpl();
					//feedbackObj.setFeedback();
					
					break;
				case 2:
					FeedbackDao feedbackObj=new FeedbackDaoImpl();
					feedbackObj.setFeedback();
					feedbackObj.showFeedback();
					
					break;
				default:
					System.out.println("Please Enter Correct Option");
			
			}
				
				
				
				
				
				
			}
			while(checkAssociateExitMenu!=0);
		}
		
		
		
		
		
		
		
		

	}

}
