package com.cg.beans;

public class ProductV1 {
  private String name;
  private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public ProductV1(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "ProductV1 [name=" + name + ", id=" + id + "]";
}
  
  public ProductV1(){}
}
