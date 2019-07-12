package com.cg.employee.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.EmployeeDaoImpl;
import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao;
	
	public void setDao(EmployeeDao dao)
	{
		this.dao= dao;
	}
	
	public EmployeeServiceImpl()
	{
		dao=new EmployeeDaoImpl();
	}

	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		
		return dao.addEmployee(emp);
	}

	@Override
	public Employee removeEmployee(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return dao.removeEmployee(empId);
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(empId);
	}

	@Override
	public ArrayList<Employee> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(int empId, int empSal)
			throws EmployeeException {
		// TODO Auto-generated method stub
		return dao.updateEmployee(empId, empSal);
	}

	
	
	public boolean validateName(String name)
	{
		String pattern="[A-Z]{1}[a-z]{2,}";
		if(Pattern.matches(pattern,name))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Pattern ::First letter has to be Capital");
			return false;
		}
	}
	
	public boolean validateSalary(int salary)
	{
		String pattern="[0-9]{4,6}";
		String sal=""+salary;
		if(Pattern.matches(pattern ,sal))
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Number: 10 digits");
			return false;
		}
	}
	public boolean validateDate(String date)
	{
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate bdate=LocalDate.parse(date, format);
		if(bdate!=null)
		{
			return true;
		}
		else
		{
			System.out.println("Invalid Date Patter: has to be DD/MM/YYYY");
			return false;
		}
	}

}
