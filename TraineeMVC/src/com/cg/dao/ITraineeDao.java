package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;

public interface ITraineeDao {

	Trainee save(Trainee trainee);

	

	Trainee load(int id);

	List<Trainee> loadAll();

}
