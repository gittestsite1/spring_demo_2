package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public String getProduct(){
        return productRepository.getProduct();
    }
}
