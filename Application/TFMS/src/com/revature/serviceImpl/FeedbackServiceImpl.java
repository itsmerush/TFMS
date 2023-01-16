package com.revature.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.revature.model.Feedback;
import com.revature.model.QuestionManagement;
import com.revature.service.FeedbackService;
import com.revature.util.QuestionsSection;
import com.revature.dao.QuestionManagementDao;

public class FeedbackServiceImpl  implements FeedbackService{

	@Override
	public HashMap<String, Integer []> setFeedbackInput(Feedback F) {
		
		
		//This objects are for dummy use , we need to get question management list till here
		List<QuestionManagement>yyyyy=QuestionManagementDao.getQuestions();
		QuestionManagement q=new QuestionManagement();
		q.setQuestion_id("Q1");
		q.setQuestionSection(QuestionsSection.INSTRUCTOR);
		q.setQuestionText("Understandibility of Trainer");
		
		QuestionManagement q2=new QuestionManagement();
		q2.setQuestion_id("Q2");
		q2.setQuestionSection(QuestionsSection.COURSEMATERIAL);
		q2.setQuestionText("How do you rate course material");
		
		QuestionManagement q3=new QuestionManagement();
		q3.setQuestion_id("Q3");
		q3.setQuestionSection(QuestionsSection.JOBIMPACT);
		q3.setQuestionText("Have you used skills tought you,in your job");
		
		yyyyy.add(q);
		yyyyy.add(q2);
		yyyyy.add(q3);
		
		HashMap<String, Integer[]> lr=new HashMap<>();
		
		List<Integer>tr=new ArrayList<>();
		
		tr.add(0);
		tr.add(0);
		tr.add(0);
		tr.add(0);
		tr.add(0);
		tr.add(0);
		
		
		
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//F.setTraineeId(tempAssociateId);
		System.out.println("Enter the Trainer Name");
		String trainerName=sc.nextLine();

		
		System.out.println("Enter the Topic");
		String topic=sc.nextLine();
		F.setTopic(topic);
		
		String []sectionRating1= {"INSTRUCTOR","COURSEMATERIAL","JOBIMPACT","ENVIRONMENT","LEARNINGEFFECTIVENESS","OVERALLRATING"};
		
		Integer[]sectionRatingByAvg= {0,0,0,0,0,0};
		
		
		int insRating=0;
		int cmRating=0;
		int jbRating=0;
		int envRating=0;
		int lefRating=0;
		int ovrRating=0;
		
		for(QuestionManagement que:yyyyy) {
			
			System.out.println(que.getQuestionText());
			if(que.getQuestionSection().toString()=="INSTRUCTOR") {
				System.out.println("Enter rating in 1 to 5");
				int rate=sc.nextInt();
				sc.nextLine();
				tr.add(0,tr.get(0)+rate);
				tr.add(5,tr.get(5)+rate);
				insRating+=1;
				ovrRating+=1;
			}else if(que.getQuestionSection().toString()=="COURSEMATERIAL") {
				System.out.println("Enter rating in 1 to 5");
				int rate=sc.nextInt();
				sc.nextLine();
				tr.add(1,tr.get(1)+rate);
				tr.add(5,tr.get(5)+rate);
				cmRating+=1;
				ovrRating+=1;
			}else if(que.getQuestionSection().toString()=="JOBIMPACT") {
				System.out.println("Enter rating in 1 to 5");
				int rate=sc.nextInt();
				sc.nextLine();
				tr.add(2,tr.get(2)+rate);
				tr.add(5,tr.get(5)+rate);
				jbRating+=1;
				ovrRating+=1;
			}else if(que.getQuestionSection().toString()=="ENVIRONMENT") {
				System.out.println("Enter rating in 1 to 5");
				int rate=sc.nextInt();
				sc.nextLine();				
				tr.add(3,tr.get(3)+rate);
				tr.add(5,tr.get(5)+rate);
				envRating+=1;
				ovrRating+=1;
			}else if(que.getQuestionSection().toString()=="LEARNINGEFFECTIVENESS") {
				System.out.println("Enter rating in 1 to 5");
				int rate=sc.nextInt();
				sc.nextLine();
				tr.add(4,tr.get(4)+rate);
				tr.add(5,tr.get(5)+rate);
				lefRating+=1;
				ovrRating+=1;
			}
		}
		
		//not calling every method because we need to give object for that section
		sectionRatingByAvg[0]=caclAverageBySection("INSTRUCTOR",insRating,tr);
		sectionRatingByAvg[1]=caclAverageBySection("COURSEMATERIAL",cmRating,tr);
		sectionRatingByAvg[2]=caclAverageBySection("JOBIMPACT",jbRating,tr);
//		sectionRatingByAvg[3]=caclAverageBySection("ENVIRONMENT",envRating,tr);
//		sectionRatingByAvg[4]=caclAverageBySection("LEARNINGEFFECTIVENESS",lefRating,tr);
		sectionRatingByAvg[5]=caclAverageBySection("OVERALLRATING",ovrRating,tr);
		
		
		lr.put(trainerName,sectionRatingByAvg);
		
		return lr;
		
		
	}
	
	
	
	public int caclAverageBySection(String sec,int cnt,List<Integer>tr) {
		int rating=0;
		if(sec=="INSTRUCTOR") {
			//System.out.println(tr.get(0));
			rating=tr.get(0)/cnt;
		}else if(sec=="COURSEMATERIAL") {
			rating=tr.get(1)/cnt;
		}else if(sec=="JOBIMPACT") {
			rating=tr.get(2)/cnt;
		}else if(sec=="ENVIRONMENT") {
			rating=tr.get(3)/cnt;
		}else if(sec=="LEARNINGEFFECTIVENESS") {
			rating=tr.get(4)/cnt;
		}else if(sec=="OVERALLRATING") {
			rating=tr.get(5)/cnt;
		}
		
	
		
		return rating;
	}
	
	

}
