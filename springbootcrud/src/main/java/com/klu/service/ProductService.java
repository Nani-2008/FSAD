package com.klu.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.Product;
import com.klu.Exception.ProductDuplicateException;
import com.klu.Exception.ProductNotFoundException;
import com.klu.Repository.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository prodrepo;
	ProductService(ProductRepository prodrepo){
		this.prodrepo=prodrepo;
	}
	
	public Product addProduct(Product prod) {
	    return prodrepo.save(prod);
	}
	public List<Product> getAllProducts(){
		return prodrepo.findAll();
	}
	public Product getById(int id) {
		//
		return prodrepo.findById(id).orElseThrow(() -> new ProductNotFoundException("product with the id "+id+"is not found"));
	}
	public Product updateProduct(int id,Product newprod) {
		Product existing=prodrepo.findById(id).orElse(null);
		while(existing != null) {
			existing.setProdId(newprod.getProdId());
			existing.setProdName(newprod.getProdName());
			existing.setProudPrice(newprod.getProudPrice());
		}
		return existing;
	}
	public String deleteProduct(int id) {
		prodrepo.deleteById(id);
		return "Deleted";
	}
	
}