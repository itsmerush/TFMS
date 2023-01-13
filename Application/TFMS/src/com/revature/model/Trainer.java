package com.revature.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Trainer {
	String trainerId;
	String trainerName;
	String track;
	String qualification;
	int experience;

	public Trainer() {
		super();
	}
	
	
	
	public Trainer(String trainerId, String trainerName, String track, String qualification, int experience) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.track = track;
		this.qualification = qualification;
		this.experience = experience;
	}


	public String getTrainerId() {
		return trainerId;
	}



	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}



	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
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



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}


	class TrainerComparator implements Comparator<Trainer> {

		public int compare(Trainer s1, Trainer s2) {
			if (s1.experience == s2.experience)
				return 0;
			else if (s1.experience > s2.experience)
				return 1;
			else
				return -1;
		}
	}

	public static void main(String[] args) {
		Trainer t = new Trainer("123", "a", "Java", "M.E", 15);
		Trainer t2 = new Trainer("123", "b", "Java", "M.E", 1);
		Trainer t3 = new Trainer("123", "c", "Java", "M.E", 5);
		Trainer t4 = new Trainer("123", "D", "Java", "M.E", 4);
		Trainer t5 = new Trainer("123", "e", "Java", "M.E", 8);

		List<Trainer> l = new ArrayList<>();
		l.add(t);
		l.add(t5);
		l.add(t2);
		l.add(t3);
		l.add(t4);

		for (Trainer Trainer : l) {
			System.out.println(Trainer.trainerId + " " + Trainer.trainerName + " " + Trainer.track + " "
					+ Trainer.qualification + " " + Trainer.experience);

		}

		System.out.println("----------------------------------------8i=");

		Trainer sd = new Trainer();

		Collections.sort(l, sd.new TrainerComparator());
		for (Trainer Trainer : l) {
			System.out.println(Trainer.trainerId + " " + Trainer.trainerName + " " + Trainer.track + " "
					+ Trainer.qualification + " " + Trainer.experience);

		}
	}



	
}
