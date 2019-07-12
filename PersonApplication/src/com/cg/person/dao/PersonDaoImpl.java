package com.cg.person.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.cg.person.dto.Person;
import com.cg.person.exception.PersonException;
import com.cg.person.util.DbUtil;
import com.cg.person.dto.Person;
import com.cg.person.exception.PersonException;
import com.cg.logger.MyLogger;

public class PersonDaoImpl implements PersonDao{
	Connection con;
	Logger logger;
	
	public PersonDaoImpl()
	{
		con=DbUtil.getConnect();
		logger=MyLogger.getLogger();
	}
	public int getPersonId() throws PersonException
	{
		logger.info("in get Person id");
		int id=0;
		String qry="select pId_seq.currval from dual";
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
			throw new PersonException(e.getMessage());
		}
		logger.info("completed get Personid");
		return id;
	}
	@Override
	public int addPerson(Person emp) throws PersonException {
		// TODO Auto-generated method stub
		logger.info("in add Person");
		logger.info("input is"+emp);
		
		int id=0;
		String qry ="insert into Person values(pId_seq.nextval,?,?,?,?,?,?)";
		String fname =emp.getFname();
		String lname =emp.getLname();
		String address =emp.getAddress();
		int Phn=emp.getPhone_No();
		int age=emp.getAge();
		String gender=emp.getGender();
		
		
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1, fname);
			pstmt.setString(2,lname);
			pstmt.setString(3,address);
			pstmt.setInt(4,Phn);
			pstmt.setInt(5,age);
			pstmt.setString(6,gender);
			
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				id=getPersonId();
				logger.info("inserted successfully and id is ="+id);
				
			}
			else
			{
				throw new PersonException("unable to insert "+emp);
			}
			
		}
		catch(SQLException e)
		{
			logger.error("error in insert  = "+e.getMessage());
			throw new PersonException(e.getMessage());
		}
		return id;
	}

	@Override
	public Person removePerson(int perId) throws PersonException {
		// TODO Auto-generated method stub
		Person emp=null;
	    String qry="delete from Person where perId=?";
	    try
	    {
	    	PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,perId);
	    	emp =getPersonById(perId);
	    	int row=pstmt.executeUpdate();
	    	if(emp==null)
	    		
	    	{
	    		throw new PersonException("emp with id "+perId+"not found");
	    	}
	    	else if(row > 0)
	    	{
	    		System.out.println("Deleted Person with id "+perId);
	    	}
	    }
	    catch(SQLException e)
	    {
	    	throw new PersonException(e.getMessage());
	    }
		
		return emp;
	}

	@Override
	public Person getPersonById(int perId) throws PersonException {
		// TODO Auto-generated method stub
		Person emp=null;
		String qry="select * from Person where perId=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,perId);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		int id=rs.getInt(1);
	    		String fname=rs.getString(2);
	    		String lname=rs.getString(3);
	    		String address=rs.getString(4);
	    		int Phn=rs.getInt(5);
	    		int age=rs.getInt(6);
	    		String gender=rs.getString(7);
	    		
	    		emp= new Person(id,fname,lname,address,Phn,age,gender);
	    		
	    			}
	    	else
	    		throw new PersonException("Person WITH ID "+perId+"not found");
		}
		catch(SQLException e)
		{
			throw new PersonException(e.getMessage());
			}
		return emp;
	}

	@Override
	public ArrayList<Person> getAllPerson() throws PersonException {
		// TODO Auto-generated method stub
		ArrayList <Person> list=new ArrayList <Person>();
		String qry="select * from PersonJEE";
		try
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			while(rs.next())
			{
				int id=rs.getInt(1);
	    		String fname=rs.getString(2);
	    		String lname=rs.getString(3);
	    		String address=rs.getString(4);
	    		int Phn=rs.getInt(5);
	    		int age=rs.getInt(6);
	    		String gender=rs.getString(7);
				Person emp=new Person(id,fname,lname,address,Phn,age,gender);
				list.add(emp);
				
			}
		}
		catch(SQLException e)
		{
			throw new PersonException(e.getMessage());
		}
		return list;
	}

}
