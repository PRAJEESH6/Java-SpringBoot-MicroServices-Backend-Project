package com.Product_Service.Microservice_Product_Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Product_Service.Microservice_Product_Service.Entity.Product;
import com.Product_Service.Microservice_Product_Service.Repository.Product_Repository;

@RestController
@RequestMapping("/product")
public class Product_Controller {
	
	@Autowired
	private Product_Repository product_repository;
	
	//Create the Product..
	@PostMapping("/get_products")
	public Product AddProducts(@RequestBody Product product)
	{ 
		return product_repository.save(product);
	}
	
	//Read the Details
	@GetMapping()
    public List<Product> GetProduct()
    {
		return product_repository.findAll();
    }

	
	//Get product from ID
	@GetMapping("/{productId}")
	public ResponseEntity<Product> GetProductFrom_ID(@PathVariable Long productId)
	{
		Product product = product_repository.findById(productId)
				.orElseThrow(()-> new RuntimeException("Product id is not found"+ productId));
		return ResponseEntity.ok(product);
	}
}
