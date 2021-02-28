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

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this.getClass() != obj.getClass())
		    return false;

		Product other = Product.class.cast(obj);
		return other.toString().equals(this.toString()) &&
				other.getPrice() == this.getPrice();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}