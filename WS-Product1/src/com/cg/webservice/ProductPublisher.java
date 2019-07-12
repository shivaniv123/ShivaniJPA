package com.cg.webservice;

import javax.xml.ws.Endpoint;



public class ProductPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Endpoint.publish("http://127.0.0.1:8081/cs", new Product());
	}

}
