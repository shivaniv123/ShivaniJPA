package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeDao;
import com.cg.entities.Trainee;

@Service
@Transactional
public class TraineeService implements ITraineeService{

	@Autowired
	private ITraineeDao traineeDao;

	@Override
	public Trainee save(Trainee trainee) {
		// TODO Auto-generated method stub
		return traineeDao.save(trainee);
	}

	
	@Override
	public Trainee load(int id) {
		// TODO Auto-generated method stub
		return traineeDao.load(id);
	}

	@Override
	public List<Trainee> loadAll() {
		// TODO Auto-generated method stub
		return traineeDao.loadAll();
	}

}
