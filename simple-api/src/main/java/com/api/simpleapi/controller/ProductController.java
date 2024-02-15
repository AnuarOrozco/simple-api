package com.api.simpleapi.controller;

import com.api.simpleapi.entities.Products;
import com.api.simpleapi.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Products")
public class ProductController {

    @Autowired
    private ProductsService productService;

    @GetMapping("/Get")
    public ResponseEntity<Products> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    };

}
