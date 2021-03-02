package br.com.zevolution.algorithms.sorting.mergesort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		// Two previously ordered parts
		Product[] products = {
				new Product("product2", 4),
				new Product("product3", 5),
				new Product("product5", 8),
				new Product("product6", 9),
				new Product("product1", 3),
				new Product("product4", 6),
				new Product("product7", 9.3),
				new Product("product8", 10)
		};

		Product[] array = sort(products);


		System.out.println(Arrays.toString(array));

	}

	private static Product[] sort(Product[] products) {
		int medium = products.length / 2;
		Product[] array = new Product[products.length];

		int current = 0;
		int left = 0;
		int right = medium;

		while (left < medium && right < products.length) {
			if (products[left].getPrice() < products[right].getPrice()) {
				array[current] = products[left];
				left++;
			} else {
				array[current] = products[right];
				right++;
			}
			current++;
		}

		return array;
	}

}