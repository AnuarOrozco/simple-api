**Simple API Exercise**

This project demonstrates a simple API implementation using Spring Boot. The API provides basic CRUD operations for managing products.

**Code Overview**

**ProductController**

The ProductController handles HTTP requests related to products. It provides an endpoint to retrieve product information.

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

`    `@Autowired

`    `private ProductsService productService;

`    `@GetMapping("/Get")

`    `public ResponseEntity<Products> getProducts(){

`        `return ResponseEntity.ok(productService.getProducts());

`    `}

}

**Products**

The Products class represents the product entity with its attributes and methods for accessing and modifying them.

package com.api.simpleapi.entities;

import jakarta.persistence.\*;

@Entity

public class Products {

`    `@Id

`    `@GeneratedValue(strategy = GenerationType.IDENTITY)

`    `private Long id;

`    `@Column(name = "name")

`    `private String name;

`    `@Column(name = "description")

`    `private String description;

`    `@Column(name = "price")

`    `private Double price;

`    `// Getters and setters

`    `public Long getId() {

`        `return id;

`    `}

`    `public void setId(Long id) {

`        `this.id = id;

`    `}

`    `public String getName() {

`        `return name;

`    `}

`    `public void setName(String name) {

`        `this.name = name;

`    `}

`    `public String getDescription() {

`        `return description;

`    `}

`    `public void setDescription(String description) {

`        `this.description = description;

`    `}

`    `public Double getPrice() {

`        `return price;

`    `}

`    `public void setPrice(Double price) {

`        `this.price = price;

`    `}

}

**ProductRepository**

The ProductRepository interface extends CrudRepository to provide CRUD operations for the Products entity.

package com.api.simpleapi.repository;

import com.api.simpleapi.entities.Products;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends CrudRepository<Products, Long> {

}

**ProductsService**

The ProductsService class provides the business logic for handling product data. It interacts with the ProductRepository to perform data operations.

package com.api.simpleapi.service;

import com.api.simpleapi.entities.Products;

import com.api.simpleapi.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class ProductsService {

`    `@Autowired

`    `private ProductRepository productRepository;

`    `public Products getProducts() {

`       `return (Products) productRepository.findAll();

`    `}

}

**Summary**

This simple API project illustrates how to set up a basic Spring Boot application with a REST controller, entity, repository, and service layer. The API provides an endpoint to retrieve products from the database. 🚀
