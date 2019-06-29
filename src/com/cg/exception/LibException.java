package com.cg.exception;

public class LibException extends Exception {

	 String message;

		public LibException(String message) {
		
			this.message = message;
		}
		@Override
		public String getMessage() {
			return this.message;
		}
}
