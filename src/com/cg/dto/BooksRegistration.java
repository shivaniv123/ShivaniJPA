package com.cg.dto;


import java.time.LocalDate;

public class BooksRegistration {

	private int reg_id;
	private int book_id;
	private int user_id;
	private LocalDate reg_date;
	
	public BooksRegistration() {}
	
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public LocalDate getReg_date() {
		return reg_date;
	}
	public void setReg_date(LocalDate reg_date) {
		this.reg_date = reg_date;
	}
	public BooksRegistration(int reg_id, int book_id, int user_id, LocalDate reg_date) {
		super();
		this.reg_id = reg_id;
		this.book_id = book_id;
		this.user_id = user_id;
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "BooksRegistration [reg_id=" + reg_id + ", book_id=" + book_id
				+ ", user_id=" + user_id + ", reg_date=" + reg_date + "]";
	} 
	
	
	 
}
