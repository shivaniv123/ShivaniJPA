package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cg.beans.Product;
import com.cg.beans.ProductV1;
import com.cg.staticdb.ProductDB;
import com.cg.staticdb.ProductV1DB;

@Repository
public class ProductDAOImpl implements IProductDAO {
	static HashMap<Integer, Product> productIdMap = ProductDB.getProductIdMap();
	static HashMap<Integer, ProductV1> productV1IdMap = ProductV1DB
			.getProductV1IdMap();

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> product = new ArrayList<Product>(productIdMap.values());
		return product;
	}

	@Override
	public Product addProduct(Product Product) {
		// TODO Auto-generated method stub
		productIdMap.put(Product.getId(), Product);
		return Product;
	}

	@Override
	public Product deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productIdMap.remove(id);
	}

	/*
	 * @Override public Product updateProduct(Product Product) { // TODO
	 * Auto-generated method stub int id=Product.getId(); for(Map.Entry<Integer,
	 * Product> p :productIdMap.entrySet()) { if(p.getKey()==id) { Product
	 * pro=p.getValue(); pro.setName(Product.getName());
	 * pro.setPrice(Product.getPrice()); break; } } return Product; }
	 */

	public Product updateProduct(Product Product) {
		if (Product.getId() <= 0)
			return null;
		productIdMap.put(Product.getId(), Product);
		return Product;

	}

	public Product getProduct(int id) {
		Product Product = productIdMap.get(id);
		return Product;
	}

	@Override
	public List<ProductV1> getAllProductsV1() {
		// TODO Auto-generated method stub
		List<ProductV1> productV1 = new ArrayList<ProductV1>(
				productV1IdMap.values());
		return productV1;
	}
}
