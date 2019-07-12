package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cg.dao.StudentDao;
import com.cg.entities.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentRepository;

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> loadAll() {
		// TODO Auto-generated method stub
		return studentRepository.loadAll();
	}

	@Override
	public Student load(int id) {
		// TODO Auto-generated method stub
		return studentRepository.load(id);
	}

}
