package com.srv.app.product.service.impl;

import com.srv.app.product.model.Product;
import com.srv.app.product.repository.ProductRepository;
import com.srv.app.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public String saveProduct(Product product) {
        return null;
    }

    @Override
    public String updateProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public void deleteProduct(String pid) {

    }
}
