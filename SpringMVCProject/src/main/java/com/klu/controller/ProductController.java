package com.klu.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public Product getProductInfo(@PathVariable int id) {
    	Product product=new Product(1221,"gold",700000.0);
    	return product;
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
    	return product;
    }
    @PutMapping("{id}")
    public Product update(@PathVariable int id,@RequestBody Product product) {
    	product.setId(id);
    	return product;
    }
    @DeleteMapping("{id}")
    public String delteUser(@PathVariable("id") int id) {
    	return "User got deleted";
    }
}
