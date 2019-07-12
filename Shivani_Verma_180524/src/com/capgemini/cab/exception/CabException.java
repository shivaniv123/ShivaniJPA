package com.capgemini.cab.exception;

public class CabException extends Exception{
	 String message;

		public CabException(String message) {
		
			this.message = message;
		}
		@Override
		public String getMessage() {
			return this.message;
		}
}
