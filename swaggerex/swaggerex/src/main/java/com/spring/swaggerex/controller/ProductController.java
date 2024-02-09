package com.spring.swaggerex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.swaggerex.entity.Product;
import com.spring.swaggerex.service.ProductSrvice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
// give name what we defined in main
@SecurityRequirement(name="swagsecurity")
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductSrvice productService;
	
	@Operation(
			tags="Create Product API",
			description="This api will perform save product operation",
			responses = {
					@ApiResponse(
						description="Success",
						responseCode="200"
					),
					@ApiResponse(
						description="Product Not Saved or Issue with getting source",
						responseCode="400"
					)
			}
	)
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return this.productService.saveProduct(product);
	}
	
	@Operation(
			tags="Product List API",
			description="This api will perform fetching product list",
			responses = {
					@ApiResponse(
						description="Success",
						responseCode="200"
					),
					@ApiResponse(
						description="Product Not Present or Issue with getting source",
						responseCode="400"
					)
			}
	)
	@GetMapping("/list")
	public List<Product> fetchAllProducts(){
		return this.productService.fetchAllProducts();
	}
	
	@Operation(
			tags="Product Update API",
			description="This api will perform edit product operation",
			responses = {
					@ApiResponse(
						description="Success",
						responseCode="200"
					),
					@ApiResponse(
						description="Product Not Present or Issue with getting source",
						responseCode="400"
					)
			}
	)
	@PutMapping("/update/{productid}")
	public Product updateProduct(@PathVariable("productid") int productid, @RequestBody Product product) {
		return this.productService.updateProduct(productid, product);
	}
	
	
	@Operation(
			tags="Product Delete API",
			description="This api will perform delete product operation",
			responses = {
					@ApiResponse(
						description="Success",
						responseCode="200"
					),
					@ApiResponse(
						description="Product Not Present or Issue with getting source",
						responseCode="400"
					)
			}
	)
	@DeleteMapping("/delete/{productid}")
	public void deleteProduct(@PathVariable("productid")int productid) {
		this.productService.deleteProduct(productid);
	}
}
