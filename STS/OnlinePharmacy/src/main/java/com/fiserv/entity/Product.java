package com.fiserv.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PROD_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	@Column(name = "PROD_NAME")
	private String productName;

	@Column(name = "PROD_IMAGE")
	private String productImage;

	@Column(name = "PROD_PRICE")
	private double productPrice;

	@Column(name = "PROD_RATING")
	private int productRating;

	@Column(name = "PROD_VIEWS")
	private int noOfViews;

	@Column(name = "PROD_BRAND")
	private String productCompany;

	@Column(name = "PROD_COUNT")
	private int noOfProducts;

	@Column(name = "PROD_INFO", length = 4000)
	private String productInfo;

	@Column(name = "PROD_DISC")
	private int discount;

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

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductRating() {
		return productRating;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

	public int getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(int noOfViews) {
		this.noOfViews = noOfViews;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public int getNoOfProducts() {
		return noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productImage=" + productImage
				+ ", productPrice=" + productPrice + ", productRating=" + productRating + ", noOfViews=" + noOfViews
				+ ", productBrand=" + productCompany + ", noOfProducts=" + noOfProducts + ", productInfo=" + productInfo
				+ "]";
	}

}
