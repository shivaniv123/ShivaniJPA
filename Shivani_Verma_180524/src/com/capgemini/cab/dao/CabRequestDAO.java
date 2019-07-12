package com.capgemini.cab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import org.apache.log4j.Logger;

import com.capgemini.cab.exception.CabException;
import com.capgemini.cab.logger.CabLogger;
import com.capgemini.cab.util.DBUtil;
import com.capgemini.cabs.bean.CabRequest;




public class CabRequestDAO implements ICabRequestDetailDAO{

	Connection con;
	Logger logger;
	
	public CabRequestDAO()
	{
		con=DBUtil.getConnect();
		logger=CabLogger.getLogger();
	}
	
	
	@Override
	public int addCabRequestDetails(CabRequest cabRequest) throws CabException {
		// TODO Auto-generated method stub
		logger.info("in add cabRequest");
		logger.info("input is"+cabRequest);
		
		
		
		int id=0;
		String qry ="insert into cab_request values(seq_request_id.nextval,?,?,sysdate,?,?,?,?)";
		String name =cabRequest.getCustomer_name();
		long Phn=cabRequest.getPhone_number();
		
		String status =cabRequest.getRequest_status();
		String address =cabRequest.getAddress_of_pickup();
		String cab_no =cabRequest.getCab_number();
		String pin =cabRequest.getPincode();
				
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setLong(2,Phn);
			
			pstmt.setString(4, status);
			pstmt.setString(5, cab_no);
			pstmt.setString(6, address);
			pstmt.setString(7,pin);
			int row=pstmt.executeUpdate();
			if(row > 0)
			{
				id=getRequest_Id();
				logger.info("your Cab Request has been successfully registered,your request id is ="+id);
				
			}
			else
			{
				throw new CabException("unable to register "+cabRequest);
			}
			
		}
		catch(SQLException e)
		{
			logger.error("error in insert  = "+e.getMessage());
			throw new CabException(e.getMessage());
		}
		return id;
	}

	private int getRequest_Id()  throws CabException {
		// TODO Auto-generated method stub
		logger.info("in get Request id");
		int id=0;
		String qry="select seq_request_id.currval from dual";
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
			throw new CabException(e.getMessage());
		}
		logger.info("completed get request_id");
		return id;
	}


	@Override
	public CabRequest getRequestDetails(int requestId) throws CabException {
		// TODO Auto-generated method stub
		CabRequest request=null;
		String qry="select customer_name,request_status,cab_number,address_of_pickup"
				+ " from cab_request where request_Id=?";
		try
		{
			PreparedStatement pstmt=con.prepareStatement(qry);
	    	pstmt.setInt(1,requestId);
	    	ResultSet rs=pstmt.executeQuery();
	    	if(rs.next())
	    			{
	    		
	    		String name=rs.getString(2);
	    		String status=rs.getString(5);
	    		String cab_no=rs.getString(6);
	    		String address=rs.getString(7);
	    		
	    		request= new CabRequest(name,status,cab_no,address);
	    		
	    			}
	    	else
	    		throw new CabException("request ID "+requestId+"not found");
		}
		catch(SQLException e)
		{
			throw new CabException(e.getMessage());
			}
		return request;
	}

}
