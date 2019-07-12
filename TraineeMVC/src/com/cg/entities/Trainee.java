package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Trainee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="seq_traineeid",allocationSize=10)
	@Column(name="trainee_id")
	int traineeId;
	
	@NotEmpty(message="Please Enter First Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
	@Column(name="trainee_name")
	String traineeName;
	
	@NotEmpty(message="Select location")
	String traineeLoc;
	
	@NotEmpty(message="Select Domain")
	String traineeDom;
	
	@Size(min=7,max=10,message="Phone Number Should Accept Only 10 digits")
	@Pattern(regexp = "^[0-9]+$", message = "Phone Number should contain only 10 digits")
	@NotEmpty(message="Please Enter phone Number")
	String phnNo;
	public String getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeLoc() {
		return traineeLoc;
	}
	public void setTraineeLoc(String traineeLoc) {
		this.traineeLoc = traineeLoc;
	}
	public String getTraineeDom() {
		return traineeDom;
	}
	public void setTraineeDom(String traineeDom) {
		this.traineeDom = traineeDom;
	}
	
	

}
