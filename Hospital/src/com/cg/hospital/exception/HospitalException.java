package com.cg.hospital.exception;

public class HospitalException extends Exception{

	String message;
	
	public HospitalException(String message)
	{
		this.message = message;
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}


}
