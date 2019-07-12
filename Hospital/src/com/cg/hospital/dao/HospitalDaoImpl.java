package com.cg.hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.cg.hospital.dto.Hospital;
import com.cg.hospital.exception.HospitalException;
import com.cg.hospital.logger.MyLogger;
import com.cg.hospital.util.DBUtil;


public class HospitalDaoImpl implements HospitalDao{

	Connection con;
	Logger logger;
	
	
	public HospitalDaoImpl()
	{
		con = DBUtil.getConnect();
		logger = MyLogger.getLogger();
	}

	public int getEmployeeId()throws HospitalException
	{
		logger.info("In getHospitalId");
		int id = 0;
		String qry = "SELECT pId_seq.CURRVAL FROM DUAL";
			try{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			if(rs.next())
			{
				id = rs.getInt(1);
				logger.info("Got Employee With Id"+id);
			}
			}
			catch(SQLException e)
			{
				logger.error("Error"+e.getMessage());
				throw new HospitalException(e.getMessage());
			}
			logger.info("Completed getEmployeeId");
			return id;
		
	}
	@Override
	public int addHospital(Hospital emp) throws HospitalException {
		// TODO Auto-generated method stub
		logger.info("In Add Employee");
		logger.info("Input is "+emp);
		int id = 0;
		String qry = "INSERT INTO HospitalJEE VALUES(pId_seq.NEXTVAL,?,?,?)";
		String name = emp.getpName();
		int bill = emp.getpBill();
		int phone=emp.getPhone();
		
		
		try
		{
			PreparedStatement pstmt = 
					con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setInt(2,bill);
			pstmt.setInt(3, phone);
			int row = pstmt.executeUpdate();
			if(row > 0)
			{
				id = getHospitalId();
				logger.info("Inserted successfully and Id is = "+id);
			}
			else
				throw new HospitalException("unable to insert"+emp);
			
		}
		catch(SQLException e)
		{
			logger.error("Error in insert = "+e.getMessage());
			throw new HospitalException(e.getMessage());
		}
		return id;
		
		
		
		
		
	}

	
	private int getHospitalId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Hospital removeHospital(int pId) throws HospitalException {
		// TODO Auto-generated method stub
		Hospital emp = null;
		String qry = "DELETE FROM HospitalJEE WHERE pId=?";
		try
		{
			PreparedStatement pstmt = 
					con.prepareStatement(qry);
			pstmt.setInt(1, pId);
			emp = getHospitalById(pId);
			int row = pstmt.executeUpdate();
			if(emp==null)
			{
				throw new HospitalException("emp with id "+pId+"not found");
			}
			else if(row > 0)
			{
				System.out.println("Deleted Employee with Id "+pId);
				
			}
			
		}
		catch(SQLException e)
		{
			throw new HospitalException(e.getMessage());
		}
		return emp;
	}

	@Override
	public Hospital getHospitalById(int pId) throws HospitalException {
		// TODO Auto-generated method stub
		Hospital emp = null;
		String qry = "SELECT * FROM HospitalJEE WHERE pId=?";
		try
		{
			PreparedStatement pstmt = 
					con.prepareStatement(qry);
			pstmt.setInt(1, pId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int bill = rs.getInt(3);
				int phone = rs.getInt(4);
			
				emp = new Hospital(id,name,bill,phone);
			}
			else
				throw new HospitalException("Employee with id "+pId+"not found");
		}
		catch(SQLException e)
		{
			throw new HospitalException(e.getMessage());
		}
		return emp;
	}

	@Override
	public ArrayList<Hospital> getAllHospital() throws HospitalException {
		// TODO Auto-generated method stub
		ArrayList<Hospital>list = new ArrayList<Hospital>();
		String qry = "SELECT * FROM HospitalJEE";
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int bill = rs.getInt(3);
				int phone = rs.getInt(4);
				
				Hospital emp = new Hospital(id,name,bill,phone);
				list.add(emp);
			}
		}
		catch(SQLException e)
		{
			throw new HospitalException(e.getMessage());
		}
		return list;
	}

	@Override
	public Hospital updateHospital(int pId, int pBill)throws HospitalException 
	{
		// TODO Auto-generated method stub
		Hospital emp = getHospitalById(pId);
		if(emp==null)
			throw new HospitalException("Employee with id "+pId+"Not found");
		else
		{
			String qry = "UPDATE HospitalJEE SET pBill=? WHERE pId=?";
			try{
				PreparedStatement pstmt = 
						con.prepareStatement(qry);
				pstmt.setInt(1, pBill);
				pstmt.setInt(2, pId);
				int row = pstmt.executeUpdate();
				if(row > 0)
				{
					System.out.println("updated successfully");
					emp = getHospitalById(pId);
				}      
			}
			catch(SQLException e)
			{
				throw new HospitalException(e.getMessage());
			}
			
		}
		return emp;
	}


}
