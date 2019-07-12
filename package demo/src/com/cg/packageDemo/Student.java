package com.cg.packageDemo;

public class Student {
	
	private int rollNo;
	private String name;
	private String address;
	private static int cnt=0;
	
	public Student(int rollNo, String name, String address) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.address= address;
		// TODO Auto-generated constructor stub
	}

	public static int getCnt()
	{
		return cnt;
		
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
