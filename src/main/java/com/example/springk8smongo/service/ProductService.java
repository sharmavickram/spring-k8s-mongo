package com.example.springk8smongo.service;

import com.example.springk8smongo.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    String saveProduct(@RequestBody Product product);

    List<Product> getProducts();

    Optional<Product> getProduct(@PathVariable Long id);

    String deleteProduct(@PathVariable Long id);
}
