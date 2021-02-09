package com.srv.app.product.controller;


import com.srv.app.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class ProductController {

    private final ProductService productService;

    public ResponseEntity<String> getAllProducts(){
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }
}
