package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;



public interface ITraineeService {

	public abstract Trainee save(Trainee trainee);
	
	public abstract Trainee load(int id);
	public abstract List<Trainee> loadAll();
	
}
