package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Quiz;
import com.cg.dao.IQuizDao;


@Service
public class QuizService implements IQuizService{

	@Autowired
	IQuizDao quizDao;
	
	public IQuizDao getQuizDao() {
		return quizDao;
	}

	public void setQuizDao(IQuizDao quizDao) {
		this.quizDao = quizDao;
	}
	
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizDao.addQuiz(quiz);
	}

}
