package com.klu.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	

	

	Optional<Product> findByProdName(String prodName);
	
	
}
