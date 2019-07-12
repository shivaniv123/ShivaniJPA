package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="seq_stuid",allocationSize=10)
	@Column(name="stuid")
	private int studentId;
	
	
	@NotEmpty(message="Please Enter First Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
	@Column(name="first_name")
	private String firstName;
	
	@NotEmpty(message="Please Enter Last Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
	@Column(name="last_name")
	private String lastName;
	
	@NotEmpty(message="Please Enter gender")
	private String gender;
	
	@Size(min=7,max=10,message="Phone Number Should Accept Only 10 digits")
	@Pattern(regexp = "^[0-9]+$", message = "Phone Number should contain only 10 digits")
	@NotEmpty(message="Please Enter phone Number")
	private String phnNo;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	
	
}
