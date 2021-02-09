package com.srv.app.product.controller;


import com.srv.app.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RefreshScope
@RequestMapping("/api/v1/")
public class ProductController {

    private final ProductService productService;

    @Value("${prop.value:null}")
    private String fromProp;

    @GetMapping("/all")
    public ResponseEntity<?> getAllProducts(){
        System.out.println(fromProp);
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
}
