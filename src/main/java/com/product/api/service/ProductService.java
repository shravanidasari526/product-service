package com.product.api.service;

import java.util.List;

import com.product.api.domain.Products;


public interface ProductService {
	public void createProduct(Products product);
	
	public Products findProductById(String productId);
	
	public Products findProductByProductName(String productName);
	
	public List<Products> findAllProducts();
	
	public List<Products> findProductBySuplierCode(String suplierCode);
	
}
