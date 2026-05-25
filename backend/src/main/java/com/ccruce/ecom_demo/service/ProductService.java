package com.ccruce.ecom_demo.service;

import com.ccruce.ecom_demo.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
}
