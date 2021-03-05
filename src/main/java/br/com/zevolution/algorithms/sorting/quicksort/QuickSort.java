package br.com.zevolution.algorithms.sorting.quicksort;

import java.util.Arrays;

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
		
		int cheapests = getCheapests(products, products.length);
		System.out.println(String.format("There are %d cheaper products.", cheapests));
		
		System.out.println(Arrays.toString(products));
	}

	private static int getCheapests(Product[] products, int length) {
		int cheapest = 0;
		
		Product pivotProduct = products[length - 1];
		for (int current = 0; current < length - 1; current++) {
			Product currentProduct = products[current];
			if (currentProduct.getPrice() < pivotProduct.getPrice()) {
				swap(products, current, cheapest);
				cheapest++;
			}
		}
		
		swap(products, length - 1, cheapest);
		
		return cheapest;
	}

	private static void swap(Product[] products, int from, int to) {
		Product productFrom = products[from];
		Product productTo = products[to];
		products[from] = productTo;
		products[to] = productFrom;
	}

}
