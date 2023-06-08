package com.example.springk8smongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="product")
public class Product {
    private Long id;
    private String productId;
    private String description;
    private double price;
}
