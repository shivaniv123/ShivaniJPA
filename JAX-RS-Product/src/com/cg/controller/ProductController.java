package com.cg.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cg.beans.Product;
import com.cg.dao.IProductDAO;
import com.cg.dao.ProductDAOImpl;





@Path("/products")
public class ProductController {
	
	IProductDAO dao;
	public ProductController()
	{
		dao=new ProductDAOImpl();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts() {
		List<Product> listOfProduct = dao.getAllProducts();
		return listOfProduct;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public  Product addProduct(@FormParam("txtId") int txtId,
			@FormParam("txtName") String txtName,
			@FormParam("txtPrice") long txtPrice) {
		Product product = new Product();
		product.setId(txtId);
		product.setName(txtName);
		product.setPrice(txtPrice);
		System.out.println(product);
		return dao.addProduct(product);
		
		
	}
	
	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public  Product updateProduct(@FormParam("txtId") int txtId,
			@FormParam("txtName") String txtName,
			@FormParam("txtPrice") long txtPrice) {
		Product product = new Product();
		product.setId(txtId);
		product.setName(txtName);
		product.setPrice(txtPrice);
		System.out.println(product);
		return dao.updateProduct(product);
		
		
	}
	
	
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public  Product deleteProduct(@FormParam("txtId") int id) {
		Product Product = dao.deleteProduct(id);
		
		if (Product != null) {
			return Product;
		} else {
			return new Product();
		}

	}
}
	
