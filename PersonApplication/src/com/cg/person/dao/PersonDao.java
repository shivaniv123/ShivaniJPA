package com.cg.person.dao;

import java.util.ArrayList;

import com.cg.person.dto.Person;
import com.cg.person.exception.PersonException;

public interface PersonDao {
	int addPerson(Person emp)	throws PersonException;
	Person removePerson(int empId)	throws PersonException;
	Person getPersonById(int empId)	throws PersonException;
	
	ArrayList <Person> getAllPerson() throws PersonException;
}
