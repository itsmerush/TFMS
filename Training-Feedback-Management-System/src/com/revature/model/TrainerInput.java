package com.revature.model;

import java.util.*;

public abstract class TrainerInput extends Trainer {
	
	
	
	public static List<Trainer> trainerList=new ArrayList<>();
	
	public static void setTrainerInput() {
		
		
			Trainer T=new Trainer();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Trainer ID");
			String trainerId=sc.nextLine();
			T.setTrainerId(trainerId);
			
			System.out.println("Enter the Trainer Name");
			String trainerName=sc.nextLine();
			T.setTrainerName(trainerName);
			
			System.out.println("Enter the Track");
			String track=sc.nextLine();
			T.setTrack(track);
			
			System.out.println("Enter the Trainer Qualification");
			String qualification=sc.nextLine();
			T.setQualification(qualification);
			
			System.out.println("Enter the Trainer Experience");
			int experience=sc.nextInt();
			sc.nextLine();
			T.setExperience(experience);
			
			trainerList.add(T);
			
			
		
		
	}

}
