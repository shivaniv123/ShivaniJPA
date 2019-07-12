package com.cg.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;

 
	@Id
	private int id;

	private String customerName;
	private int hotelId;
	private Date toDate;
	private Date fromDate;
	private int noOfRooms;
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", customername=" + customerName
				+ ", hotelId=" + hotelId + ", toDate=" + toDate + ", fromDate="
				+ fromDate + ", noOfRooms=" + noOfRooms + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
}
