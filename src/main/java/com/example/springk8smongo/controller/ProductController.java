package com.example.springk8smongo.controller;

import com.example.springk8smongo.model.Product;
import com.example.springk8smongo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
    public String addOrder(@RequestBody Product product){
        productService.saveProduct(product);
		return "Product added successfully::"+product.getId();
    }
	
	@GetMapping("/findAllProducts")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/findProduct/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
		return "Deleted Product Successfully::"+id;
	}
	



}