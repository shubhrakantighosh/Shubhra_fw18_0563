package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "ProductUnit")
@Entity
@NamedQuery(name = "product.Name&Quantity", query = "select productName,quantity from Product")
@NamedQuery(name = "product.Price", query = "select price from Product where productId=:productId")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Product( String productName, int price, int quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public Product() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	
}
