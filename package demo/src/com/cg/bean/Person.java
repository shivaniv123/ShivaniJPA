package com.cg.bean;

public class Person {
	
	private String name;
	private String place;
	private String phoneNo;
	
public Person(String name, String place, String phoneNo) {
		
		this.name = name;
		this.place = place;
		this.phoneNo= phoneNo;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
		
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}
