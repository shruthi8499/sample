package com.functional;

public class Consumer {
	String name;
	int price;
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Consumer [name=" + name + ", price=" + price + "]";
	}
	public Consumer(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}
