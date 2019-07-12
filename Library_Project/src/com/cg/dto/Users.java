package com.cg.dto;

public class Users {
      
	private int user_id;
	private String user_name;
	private String password;
	private String email_id;
	private String librarian;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String isLibrarian() {
		return librarian;
	}
	public void setLibrarian(String librarian) {
		this.librarian = librarian;
	}
	
	public Users(){}
	public Users(String librarian){
		this.librarian = librarian;

	}
	public Users(int user_id, String user_name, String password,
			String email_id, String librarian) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.email_id = email_id;
		this.librarian = librarian;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name
				+ ", password=" + password + ", email_id=" + email_id
				+ ", librarian=" + librarian + "]";
	}
	
	
	
}
