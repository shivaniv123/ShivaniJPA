package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;




import com.cg.entities.Student;

@Repository
public class StudentDaoImpl  implements StudentDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		entityManager.persist(student);
		entityManager.flush();
		return student;
	}

	@Override
	public List<Student> loadAll() {
		// TODO Auto-generated method stub
		TypedQuery<Student> query = 
				entityManager.createQuery("SELECT s FROM Student s",Student.class);
		return query.getResultList();
	}

	@Override
	public Student load(int id) {
		// TODO Auto-generated method stub
	return	entityManager.find(Student.class, id);
		
	}

}
