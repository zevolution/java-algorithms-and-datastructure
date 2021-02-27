package br.com.zevolution.algorithms.sorting;

public class Product {

	private String description;
	private double price;

	public Product(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return this.description;
	}

}
