package com.capgemini.cabs.bean;

import java.time.LocalDate;

public class CabRequest {
  
	 private int request_id;
	 private String customer_name;
	 private long phone_number;
	 private LocalDate date_of_request;
	 private String request_status ="Not Accepted";
	 private String cab_number;
	 private String address_of_pickup;
	 private String pincode;
	 
	public CabRequest(){}

	public CabRequest(int request_id, String customer_name, long phone_number,
			LocalDate date_of_request, String request_status,
			String cab_number, String address_of_pickup, String pincode) {
		super();
		this.request_id = request_id;
		this.customer_name = customer_name;
		this.phone_number = phone_number;
		this.date_of_request = date_of_request;
		this.request_status = request_status;
		this.cab_number = cab_number;
		this.address_of_pickup = address_of_pickup;
		this.pincode = pincode;
	}

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	public LocalDate getDate_of_request() {
		return date_of_request;
	}

	public void setDate_of_request(LocalDate date_of_request) {
		this.date_of_request = date_of_request;
	}

	public String getRequest_status() {
		return request_status;
	}

	public CabRequest(String customer_name, String request_status,
			String cab_number, String address_of_pickup) {
		super();
		this.customer_name = customer_name;
		this.request_status = request_status;
		this.cab_number = cab_number;
		this.address_of_pickup = address_of_pickup;
	}

	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}

	public String getCab_number() {
		return cab_number;
	}

	public void setCab_number(String cab_number) {
		this.cab_number = cab_number;
	}

	public String getAddress_of_pickup() {
		return address_of_pickup;
	}

	public void setAddress_of_pickup(String address_of_pickup) {
		this.address_of_pickup = address_of_pickup;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CabRequest [request_id=" + request_id + ", customer_name="
				+ customer_name + ", phone_number=" + phone_number
				+ ", date_of_request=" + date_of_request + ", request_status="
				+ request_status + ", cab_number=" + cab_number
				+ ", address_of_pickup=" + address_of_pickup + ", pincode="
				+ pincode + "]";
	}
	 
	 
}
