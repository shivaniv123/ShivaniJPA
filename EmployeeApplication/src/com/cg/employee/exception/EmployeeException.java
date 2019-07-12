package com.cg.employee.exception;

public class EmployeeException extends Exception {
	
      String message;

	public EmployeeException(String message) {
	
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}

	

	
	
      

}
