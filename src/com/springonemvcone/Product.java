package com.springonemvcone;

public class Product {

	int code;
	String name;
	float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int code, String name, float price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
