package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel implements Serializable{

	private static final long serialVersionUID = 1L;
@Id
private int id;
	
	private String name;
	private String rating;
	private double rate;
	private int availableRooms;
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", rating=" + rating
				+ ", rate=" + rate + ", availableRooms=" + availableRooms + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
}
