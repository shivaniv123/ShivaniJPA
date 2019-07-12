package com.cg.dao;

import java.util.List;

import com.cg.beans.Product;
import com.cg.beans.ProductV1;

public interface IProductDAO {
public List<Product> getAllProducts();
public Product addProduct(Product Product);
public Product updateProduct(Product Product);
public Product deleteProduct(int id);
public Product getProduct(int id);

public List<ProductV1> getAllProductsV1();


}
