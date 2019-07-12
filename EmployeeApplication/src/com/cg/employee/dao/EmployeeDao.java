package com.cg.employee.dao;

import java.util.ArrayList;

import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;

public interface EmployeeDao {
    
	int addEmployee(Employee emp)	throws EmployeeException;
	Employee removeEmployee(int empId)	throws EmployeeException;
	Employee getEmployeeById(int empId)	throws EmployeeException;
	
	ArrayList <Employee> getAllEmployee() throws EmployeeException;
	Employee updateEmployee(int empId,int empSal)throws EmployeeException;
}
