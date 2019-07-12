package com.cg.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.cg.employee.dto.Employee;
import com.cg.employee.exception.EmployeeException;
import com.cg.employee.util.DBUtil;
import com.cg.logger.MyLogger;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Connection con;
	Logger logger;
	
	public EmployeeDaoImpl()
	{
		con=DBUtil.getConnect();
		logger=MyLogger.getLogger();
	}

	public int getemployeeId() throws EmployeeException
	{
		logger.info("in get employee id");
		int id=0;
		String qry="select eId_seq.currval from dual";
		try{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next())
		{
			id=rs.getInt(1);
			logger.info("got message with id  :"+id);
		}
		}
		catch(SQLException e)
		{
			logger.error("error"+e.getMessage());
			throw new EmployeeException(e.getMessage());
		}
		logger.info("completed get employeeid");
		return id;
	}
	@Override
	public int addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		logger.info("in add employee");
		logger.info("input is"+emp);
		
		int id=0;
		String qry ="insert into EmployeeJEE values(eId_seq.nextval,?,?,?)";
		String name =emp.getEmpName();
		int sal=emp.getEmpSal();
		LocalDate bDate=emp.getbDate();
		java.sql.Date date=java.sql.Date.valueOf(bDate);
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setInt(2,sal);
			pstmt.setDate(3, date);
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				id=getemployeeId();
				logger.info("inserted successfully and id is ="+id);
				
			}
			else
			{
				throw new EmployeeException("unable to insert "+emp);
			}
			
		}
		catch(SQLException e)
		{
			logger.error("error in insert  = "+e.getMessage());
			throw new EmployeeException(e.getMessage());
		}
		return id;
	}

	@Override
	public Employee removeEmployee(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=null;
	    String qry="delete from EmployeeJEE where empId=?";
	    try
	    {
	    	PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,empId);
	    	emp =getEmployeeById(empId);
	    	int row=pstmt.executeUpdate();
	    	if(emp==null)
	    		
	    	{
	    		throw new EmployeeException("emp with id "+empId+"not found");
	    	}
	    	else if(row > 0)
	    	{
	    		System.out.println("Deleted employee with id "+empId);
	    	}
	    }
	    catch(SQLException e)
	    {
	    	throw new EmployeeException(e.getMessage());
	    }
		
		return emp;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=null;
		String qry="select * from EmployeeJEE where empId=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,empId);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		int id=rs.getInt(1);
	    		String name=rs.getString(2);
	    		int sal=rs.getInt(3);
	    		java.sql.Date date=rs.getDate(4);
	    		java.time.LocalDate bDate= date.toLocalDate();
	    		emp= new Employee(id,name,sal,bDate);
	    		
	    			}
	    	else
	    		throw new EmployeeException("EMPLOYEE WITH ID "+empId+"not found");
		}
		catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
			}
		return emp;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		ArrayList <Employee> list=new ArrayList <Employee>();
		String qry="select * from EmployeeJEE";
		try
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int sal=rs.getInt(3);
				java.sql.Date date=rs.getDate(4);
				LocalDate bDate=date.toLocalDate();
				Employee emp=new Employee(id,name,sal,bDate);
				list.add(emp);
				
			}
		}
		catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
		}
		return list;
	}

	@Override
	public Employee updateEmployee(int empId, int empSal)
			throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=getEmployeeById(empId);
		if(emp==null)
		{
			throw new EmployeeException("employee with id "+empId+" not found");
		}
		else
		{
			String qry="update EmployeeJEE set empSal=? where empId=?";
		
		try
		{
			
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setInt(1,emp.getEmpSal()+empSal);
			pstmt.setInt(2,empId);
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				System.out.println("Update successfully");
				emp=getEmployeeById(empId);
			}
		}
		
		catch(SQLException e)
		{
			throw new EmployeeException(e.getMessage());
		}}
		return emp;
	}

}
