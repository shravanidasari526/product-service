package com.product.api.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.api.domain.Products;
import com.product.api.repository.ProductRepository;
import com.product.api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Products product) {
		productRepository.save(product);
	}

	@Override
	public Products findProductById(String productId) {
		Products product = productRepository.findById(productId).get();
		return product;
	}

	@Override
	public Products findProductByProductName(String productName) {
		Products product = new Products();
		product = productRepository.findByProductName(productName);
		return product;
	}

	@Override
	public List<Products> findAllProducts() {
		List<Products> productList = new ArrayList<>();
		productList = productRepository.findAll();
		return productList;
	}

	@Override
	public List<Products> findProductBySuplierCode(String suplierCode) {
		List<Products> productList = new ArrayList<>();
		productList = productRepository.findProductBySuplierCode(suplierCode);
		return productList;
	}
	
}
