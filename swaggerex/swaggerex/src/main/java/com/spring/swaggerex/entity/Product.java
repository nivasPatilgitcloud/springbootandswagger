package com.spring.swaggerex.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Unique identifier of the product auto incremented",example="1",required = true)
	private int productid;
	@Schema(description = "Name of product", example="Dell")
	private String productname;
	@Schema(description = "Product Catagory", example="Laptop")
	private String productcatagory;
	@Schema(description = "Product Price", example="569999")
	private String productprice;
	@Schema(description = "Product Quantity", example="199")
	private String productquantity;
	public Product(int productid, String productname, String productcatagory, String productprice,
			String productquantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcatagory = productcatagory;
		this.productprice = productprice;
		this.productquantity = productquantity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcatagory() {
		return productcatagory;
	}
	public void setProductcatagory(String productcatagory) {
		this.productcatagory = productcatagory;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productcatagory="
				+ productcatagory + ", productprice=" + productprice + ", productquantity=" + productquantity + "]";
	}
	
	
}
