package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Product;
import com.cg.beans.ProductV1;
import com.cg.dao.IProductDAO;

@CrossOrigin(origins = "http://localhost:8086")
@RestController
public class ProductController {

	@Autowired
	IProductDAO dao;

	// @GetMapping("/products")
	@RequestMapping(value = "/products", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Product> getAllProduct(Model model) {
		return dao.getAllProducts();
	}

	// @GetMapping("/v1/products")
	@RequestMapping(value = "v1/products", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<ProductV1> getAllProductV1(Model model) {
		return dao.getAllProductsV1();
	}

	@PostMapping("/products")
	public List<Product> createProduct(@RequestParam int id,
			@RequestParam String name, @RequestParam double price,
			ModelAndView model) {
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setPrice(price);

		dao.addProduct(product);
		// model.setViewName("show.jsp");
		return dao.getAllProducts();
	}

	 @ResponseStatus(value = HttpStatus.NOT_FOUND, reason =
	 "Product with this id is not present")
	 @ExceptionHandler({ Exception.class })
	 public void handleException() {
	 }
	
	 @GetMapping("/products/search/{txtId}")
	 public Product getProductbyId(@PathVariable int txtId) {
	 return dao.getProduct(txtId);
	 }
}