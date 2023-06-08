package com.example.springk8smongo.service;

import com.example.springk8smongo.model.Product;
import com.example.springk8smongo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String saveProduct(Product product) {
        productRepository.save(product);
        return "Product added successfully::"+product.getId();
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Deleted Product Successfully::"+id;
    }
}
