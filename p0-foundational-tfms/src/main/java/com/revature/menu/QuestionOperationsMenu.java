package com.revature.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.service.QuestionManagementService;

public class QuestionOperationsMenu {
	private static final Logger logger=Logger.getLogger(QuestionOperationsMenu.class);
	public static void main(String[] args) {
		menuAppForQuestion();
	}

	public static void menuAppForQuestion() {
		int choice=0;
		int choices=0;
		Scanner sc=new Scanner(System.in);
		QuestionManagementService qms=new QuestionManagementService();
		do {
			logger.info("Choose 1 Question Management Operation\n1.Add Questions\n2.Display Questions");
			choices=sc.nextInt();
			sc.nextLine();
			switch(choices) {
			case 1:		qms.getUserInput();
				break;
			case 2:		qms.displayQuestionDetails();
				break;			
			default:
			logger.info("Please enter the valid option");}
			logger.info("If you want to continue press 1 otherwise press 0 to go outside loop");
			choice=sc.nextInt();
		} while (choice==1);
		sc.close();
		logger.info("program terminated1");
	}
}