package com.klu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int prodId;
	private String prodName;
	private double proudPrice;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProudPrice() {
		return proudPrice;
	}
	public void setProudPrice(double proudPrice) {
		this.proudPrice = proudPrice;
	}
	public Product(int prodId, String prodName, double proudPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.proudPrice = proudPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", proudPrice=" + proudPrice + "]";
	}
	

}