package com.api.simpleapi.service;

import com.api.simpleapi.entities.Products;
import com.api.simpleapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    public Products getProducts() {
       return (Products) productRepository.findAll();
    }

}
