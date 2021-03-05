package br.com.zevolution.algorithms.sorting.quicksort;

import br.com.zevolution.algorithms.sorting.Product;

public class QuickSort {
	
	public static void main(String[] args) {
		
		Product[] products = {
				new Product("iMac", 30000),	
				new Product("Keyboard", 100),
				new Product("iPhone 12 Pro Max Ultra Uou", 10000),
				new Product("Mouse", 50),
				new Product("Notebook", 3500)
		};
		
		getCheapests(products, products.length);
		
	}

	private static void getCheapests(Product[] products, int length) {
		int cheapest = 0;
		
		for (int current = 0; current < length - 1; current++) {
			Product currentProduct = products[current];
			if (currentProduct.getPrice() < products[length - 1].getPrice()) {
				cheapest++;
			}
		}
		
		System.out.println(String.format("There are %d cheaper products.", cheapest));
		
	}

}
