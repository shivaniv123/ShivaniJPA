package com.cg.clients;

import com.cg.bean.Person;

public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Person per=new Person("shivani","jhansi","9890088989");
  System.out.println("Name ="+per.getName());
  System.out.println("Place ="+per.getPlace());
  System.out.println("Phone No ="+per.getPhoneNo());
	}

}
