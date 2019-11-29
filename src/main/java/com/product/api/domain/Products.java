package com.product.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products implements Serializable{

	private static final long serialVersionUID = -4962406039948463296L;
	@Id
	private String productId;
	private String productName;
	private Double productPrice;
	private String suplierCode;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(String productId, String productName, Double productPrice, String suplierCode) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.suplierCode = suplierCode;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getSuplierCode() {
		return suplierCode;
	}
	public void setSuplierCode(String suplierCode) {
		this.suplierCode = suplierCode;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", suplierCode=" + suplierCode + "]";
	}

	
}
