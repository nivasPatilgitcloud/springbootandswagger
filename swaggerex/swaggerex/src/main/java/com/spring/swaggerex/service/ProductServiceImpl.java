package com.spring.swaggerex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.swaggerex.entity.Product;
import com.spring.swaggerex.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductSrvice{

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		
		return this.productRepository.save(product);
	}
	
	public List<Product> fetchAllProducts(){
		return this.productRepository.findAll();
	}
	
	public Product updateProduct(int productid, Product product) {
		Product iddata = this.productRepository.findById(productid).get();
		if(iddata!=null) {
			iddata.setProductname(product.getProductname());
			iddata.setProductcatagory(product.getProductcatagory());
			iddata.setProductprice(product.getProductprice());
			iddata.setProductquantity(product.getProductquantity());
		}
		
		return this.productRepository.save(iddata);
	}
	
	public void deleteProduct(int productid) {
		this.productRepository.deleteById(productid);
	}
}
