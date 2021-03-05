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
		
		quickSort(products, 0, products.length);
		
		System.out.println(Arrays.toString(products));
	}

	private static void quickSort(Product[] products, int start, int end) {
		int length = end - start; 
		if (length > 1) {
			int pivot = partitionProducts(products, start, end);
			quickSort(products, start, pivot);
			quickSort(products, pivot + 1, end);
		}
	}

	private static int partitionProducts(Product[] products, int start, int end) {
		int cheapest = start;
		
		Product pivotProduct = products[end - 1];
		for (int current = start; current < end - 1; current++) {
			Product currentProduct = products[current];
			if (currentProduct.getPrice() <= pivotProduct.getPrice()) {
				swap(products, current, cheapest);
				cheapest++;
			}
		}
		
		swap(products, end - 1, cheapest);
		
		return cheapest;
	}

	private static void swap(Product[] products, int from, int to) {
		Product productFrom = products[from];
		Product productTo = products[to];
		products[from] = productTo;
		products[to] = productFrom;
	}

}
