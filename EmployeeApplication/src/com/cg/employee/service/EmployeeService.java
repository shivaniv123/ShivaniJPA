
package com.cg.employee.service;

import java.util.ArrayList;

import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;

public interface EmployeeService {
	int addEmployee(Employee emp)	throws EmployeeException;
	Employee removeEmployee(int empId)	throws EmployeeException;
	Employee getEmployeeById(int empId)	throws EmployeeException;
	
	ArrayList <Employee> getAllEmployee() throws EmployeeException;
	Employee updateEmployee(int empId,int empSal)throws EmployeeException;
	public boolean validateName(String name);
	public boolean validateSalary(int sal);
}
