package com.capgemini.cab.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import com.capgemini.cab.dao.CabRequestDAO;
import com.capgemini.cab.exception.CabException;
import com.capgemini.cabs.bean.CabRequest;

public class CabService implements ICabService {
CabRequestDAO dao;
	
	public void setDao(CabRequestDAO dao)
	{
		this.dao= dao;
	}
	
	public CabService()
	{
		dao=new CabRequestDAO();
	}
	@Override
	public int addCabRequestDetails(CabRequest cabRequest) throws CabException {
		// TODO Auto-generated method stub
		return dao.addCabRequestDetails(cabRequest );
	}

	@Override
	public CabRequest getRequestDetails(int requestId) throws CabException {
		// TODO Auto-generated method stub
		return dao.getRequestDetails(requestId);
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		String pattern="[A-Z]{1}[a-z]{2,}";
		if(Pattern.matches(pattern,name))
		{
			return true;
		}
		else
		{
			System.out.println("Not Proper Format : First letter should be Capital of your Name");
			return false;
		}
	}

	@Override
	public boolean validatePhnNumber(long phn) {
		// TODO Auto-generated method stub
		String pattern="[0-9]{10}";
		String phn_no=""+phn;
		if(Pattern.matches(pattern ,phn_no))
		{
			return true;
		}
		else
		{
			System.out.println("Phone Number should be of 10 digits");
			return false;
		}
	}

	@Override
	public boolean validateDate(String date) {
		// TODO Auto-generated method stub
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate bdate=LocalDate.parse(date, format);
		if(bdate!=null)
		{
			return true;
		}
		else
		{
			System.out.println("Not a Proper Format : DD/MM/YYYY");
			return false;
		}
	}

	@Override
	public boolean validateRequest(String status) {
		// TODO Auto-generated method stub
		String pattern="[A-Z]{1}[a-z]{2,}";
		if(Pattern.matches(pattern,status))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean validateCab(String cab) {
		// TODO Auto-generated method stub
		String pattern="[A-Z]{4}[0-9]{5,7}";
		if(Pattern.matches(pattern,cab))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean validatePin(String pin) {
		// TODO Auto-generated method stub
		String pattern="[0-9]{4,6}";
		String pin_n=""+pin;
		if(Pattern.matches(pattern ,pin_n))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	

}
