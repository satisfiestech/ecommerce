package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private List<Product> products = new ArrayList<>();

    public ProductController() {
        // Sample products
        products.add(new Product(1L, "Laptop", 999.99, "https://via.placeholder.com/150"));
        products.add(new Product(2L, "Smartphone", 499.99, "https://via.placeholder.com/150"));
        products.add(new Product(3L, "Headphones", 79.99, "https://via.placeholder.com/150"));
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return products;
    }

    @PostMapping("/checkout")
    public String checkout(@RequestBody List<Product> cart) {
        // Simulate checkout process
        return "Checkout successful";
    }
}