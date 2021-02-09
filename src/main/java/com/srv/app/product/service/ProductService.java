package com.srv.app.product.service;

import com.srv.app.product.model.Product;

import java.util.List;

public interface ProductService {

    String saveProduct(Product product);
    String updateProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct(String pid);
}
