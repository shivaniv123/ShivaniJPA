package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeDao implements ITraineeDao{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Trainee save(Trainee trainee) {
		// TODO Auto-generated method stub
		entityManager.persist(trainee);
		entityManager.flush();
		return trainee;
	}

	

	@Override
	public Trainee load(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Trainee.class, id);
	}

	@Override
	public List<Trainee> loadAll() {
		// TODO Auto-generated method stub
		TypedQuery<Trainee> query = 
				entityManager.createQuery("SELECT s FROM Trainee s",Trainee.class);
		return query.getResultList();
		
	}

}
