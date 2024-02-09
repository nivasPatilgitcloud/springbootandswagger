package com.spring.swaggerex.service;

import java.util.List;

import com.spring.swaggerex.entity.Product;

public interface ProductSrvice {

	//save
	public Product saveProduct(Product product);
	//read
	public List<Product> fetchAllProducts();
	//update
	public Product updateProduct(int productid, Product product);
	//delete
	public void deleteProduct(int productid);
	
}
