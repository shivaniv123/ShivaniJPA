package com.cg.dto;

public class BookInventory {

	private int book_id;
	private String book_name;
	private String author1;
	private String author2;
	private String publisher;
	private int yearofpublisher;
	
	public BookInventory() {}
	
	public BookInventory(int book_id, String book_name, String author1,
			String author2, String publisher, int yearofpublisher) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author1 = author1;
		this.author2 = author2;
		this.publisher = publisher;
		this.yearofpublisher = yearofpublisher;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor1() {
		return author1;
	}
	public void setAuthor1(String author1) {
		this.author1 = author1;
	}
	public String getAuthor2() {
		return author2;
	}
	public void setAuthor2(String author2) {
		this.author2 = author2;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYearofpublisher() {
		return yearofpublisher;
	}
	public void setYearofpublisher(int yearofpublisher) {
		this.yearofpublisher = yearofpublisher;
	}
	@Override
	public String toString() {
		return "BookInventory [book_id=" + book_id + ", book_name=" + book_name
				+ ", author1=" + author1 + ", author2=" + author2
				+ ", publisher=" + publisher + ", yearofpublisher="
				+ yearofpublisher + "]";
	}
	
	

	
}
