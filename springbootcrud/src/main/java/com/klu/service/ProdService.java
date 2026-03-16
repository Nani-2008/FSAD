package com.klu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Product;
import com.klu.repository.ProdRepository;

@Service

public class ProdService {
    private final ProdRepository prodrepo;

    ProdService(ProdRepository prodrepo) {
        this.prodrepo = prodrepo;
    }
    
    public ProdRepository getProdrepo() {
        return prodrepo;
    }

    public String addProduct(Product prod) {
        prodrepo.save(prod);
        return "Product added successfully";
    }

    public List<Product> getAllProducts() {
        return prodrepo.findAll();
    }

    public Product getProductById(int id) {
        return prodrepo.findById(id).orElse(null);
    }

    public Product updateProduct(int id, Product prod) {
        Product existingProd = prodrepo.findById(id).orElse(null);
        if (existingProd != null) {
            existingProd.setName(prod.getName());
            existingProd.setPrice(prod.getPrice());
            return prodrepo.save(existingProd);
        }
        return null;
    }

    public String deleteProduct(int id) {
        prodrepo.deleteById(id);
        return "Product deleted successfully";
    }
}