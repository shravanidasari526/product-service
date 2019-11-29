package com.product.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.domain.Products;
import com.product.api.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductsController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/create")
	public void createProduct(@RequestBody Products product){
		productService.createProduct(product);
	}
	@GetMapping("/findById/{productId}")
	public Products findProductById(@PathVariable String productId) {
		return productService.findProductById(productId);
	}
	
	@GetMapping("/findByFirstName/{firstName}")
	public Products findProductByFirstName(@PathVariable String productName) {
		return productService.findProductByProductName(productName);
	}
	@GetMapping("/findAll")
	public List<Products> findAllProducts(){
		List<Products> productList = productService.findAllProducts();
		return productList;
	}
	
	@GetMapping("/getProductsBySuplierCode/{suplierCode}")
	public List<Products> getSuplierProducts(@PathVariable String suplierCode) {
		List<Products> productList = productService.findProductBySuplierCode(suplierCode);
		return productList;
	}
}
