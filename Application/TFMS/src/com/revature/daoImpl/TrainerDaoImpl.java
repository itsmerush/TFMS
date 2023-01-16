package com.revature.daoImpl;



import com.revature.dao.TrainerDao;
import com.revature.model.Trainer;
import com.revature.service.TrainerService;
import com.revature.serviceImpl.TrainerServiceImpl;

public class TrainerDaoImpl implements TrainerDao{
	public void setTrainer() {
		Trainer T=new Trainer();
		TrainerService TS=new TrainerServiceImpl();
		TS.setTrainerInput(T);
		trainerList.add(T);
		}
}
