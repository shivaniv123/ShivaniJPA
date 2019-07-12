package com.cg.hospital.dto;

import java.time.LocalDate;

public class Hospital 
{

	private int pId;
	private String pName;
	private int pBill;
	private int phone;

	public Hospital()
	{
		
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpBill() {
		return pBill;
	}

	public void setpBill(int pBill) {
		this.pBill = pBill;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Hospital(int pId, String pName, int pBill, int phone) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pBill = pBill;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Hospital [pId=" + pId + ", pName=" + pName + ", pBill=" + pBill
				+ ", phone=" + phone + "]";
	}
	
}
