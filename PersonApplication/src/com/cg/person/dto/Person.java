package com.cg.person.dto;

public class Person {
	 
       private String fname,lname,address;
       private int Phone_No,Age,perId;
       private String gender;
       
       public Person(){}
       
	public Person(int PerId,String fname, String lname, String address, int phone_No,
			int age,String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		Phone_No = phone_No;
		Age = age;
		this.gender = gender;
	}
	
	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(int phone_No) {
		Phone_No = phone_No;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", address="
				+ address + ", Phone_No=" + Phone_No + ", Age=" + Age
				+ ", perId=" + perId + ", gender=" + gender + "]";
	}
	

}
