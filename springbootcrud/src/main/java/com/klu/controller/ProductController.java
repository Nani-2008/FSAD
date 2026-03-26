package com.klu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klu.Product;
import com.klu.Exception.ProductDuplicateException;
import com.klu.Service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins="http://localhost:5173")
public class ProductController {
	private final ProductService prodservice;
	ProductController(ProductService prodservice){
		this.prodservice=prodservice;
	}
	@PostMapping("/add")
	public Product addProd(@RequestBody Product prod) {
	    return prodservice.addProduct(prod);
	}
	@GetMapping("/getAll")
	public List<Product> getAllProd(){
		return prodservice.getAllProducts();
	}
	@GetMapping("/{id}")
	public Product getById(@PathVariable("id") int id) {
		return prodservice.getById(id);
	}
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id") int id,Product prod) {
		return prodservice.updateProduct(id, prod);
		
	}
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable int id) {
		return prodservice.deleteProduct(id);
	}

}