package com.revature.aplication;
import com.revature.model.TrainerInput;
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
					TrainerInput.setTrainerInput();
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
				System.out.println("Give Feedback: Press 1");
				System.out.println("Exit : 0");
				
				checkAssociateExitMenu=sc.nextInt();
				sc.nextLine();
				
				
				
			}
			while(checkAssociateExitMenu!=0);
		}
		
		
		
		
		
		
		
		

	}

}
