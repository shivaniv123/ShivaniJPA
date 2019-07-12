package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.beans.Quiz;

@Repository
@Transactional
public class QuizDao implements IQuizDao {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		entityManager.persist(quiz);
		entityManager.flush();
		return quiz;
	}

}
