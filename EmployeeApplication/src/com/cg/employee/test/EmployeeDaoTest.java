package com.cg.employee.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.EmployeeDaoImpl;
import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeServiceImpl;

public class EmployeeDaoTest {
      
	 EmployeeServiceImpl service;
	 EmployeeDao dao; 
	 
	 @Test
	 public void TestAllEmployee() throws EmployeeException
	 {
		 ArrayList<Employee> list=service.getAllEmployee();
		 assertNotNull(list);
	 }
	 
	 @Test
	 public void testAddEmployee() throws EmployeeException
	 {
		 Employee emp =new Employee();
		 emp.setEmpName("hina");
		 emp.setEmpSal(40000);
		 emp.setbDate(LocalDate.of(1998,Month.MAY, 27));
		 
		 int id=service.addEmployee(emp);
		 assertNotSame(id,0);
	 }
	 
	 @Test
	 public void testDeleteEmployee() throws EmployeeException
	 {
		 Employee emp=service.removeEmployee(2000);
		 assertNotNull(emp);
	 }
	 
	 @Test
	 public void updateEmployee() throws EmployeeException
	 {
		 Employee emp =service.updateEmployee(2002, 20000);
		 assertNotNull(emp);
	 }
	 @Before
	 public  void init()
	 {
		dao = new EmployeeDaoImpl();
		service =new EmployeeServiceImpl() ;
		service.setDao(dao);
	 }
	 @After
	 public void destory()
	 {
		 dao=null;
		 service=null;
	 }
}
