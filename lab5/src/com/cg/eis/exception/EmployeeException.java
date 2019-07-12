package com.cg.eis.exception;

public class EmployeeException extends Exception {
String message;
	
	public EmployeeException(String message)
	{
		this.message=message;
	}
	
	public String getMessage()
	{
		return this.message;
	}

}
