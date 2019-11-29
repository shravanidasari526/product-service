package com.product.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.api.domain.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, String>{
	public Products findByProductName(String productName);
	public List<Products> findProductBySuplierCode(String suplierCode);
}
