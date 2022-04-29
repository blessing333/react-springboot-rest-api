package com.blessing333.gccoffee.domain.service;

import com.blessing333.gccoffee.domain.Category;
import com.blessing333.gccoffee.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductsByCategory(Category category);

    List<Product> getAllProducts();

    Product createProduct(String productName, Category category, long price);

    Product createProduct(String productName, Category category, long price, String description);
}
