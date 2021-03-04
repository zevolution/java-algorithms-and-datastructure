package br.com.zevolution.algorithms.sorting.mergesort;

import java.util.Arrays;

import br.com.zevolution.algorithms.sorting.insertionsort.Product;

public class MergeSort {

	public static void main(String[] args) {

		// Unsorted array
		Product[] products = {
				new Product("product3", 5),
				new Product("product2", 4),
				new Product("product6", 9),
				new Product("product5", 8),
				new Product("product4", 6),
				new Product("product1", 3),
				new Product("product9", 10),
				new Product("product8", 9.7),
				new Product("product7", 9.3)
		};

//		mergeSort(products, 0, 1, 2);
//		mergeSort(products, 2, 3, 4);
//		mergeSort(products, 4, 5, 6);
//		mergeSort(products, 6, 7, 8);
//		mergeSort(products, 0, 4, 8);
		Product[] sorted = sort(products, products.length);
//		array = mergeSort(array, 0, 2, 4);

		System.out.println(Arrays.toString(sorted));

	}

	public static Product[] sort(Product[] products, int length) {
		Product[] array = products.clone();
		mergeSort(array, 0, length);
		return array;
	}

	private static void mergeSort(Product[] products, int start, int end) {
		int length = end - start;

		if (length > 1) {
			int middle = (start + end) >> 1; // as well as (start + end) / 2

			mergeSort(products, start, middle);
			mergeSort(products, middle, end);
			mergeSort(products, start, middle, end);
		}
	}

	private static void mergeSort(Product[] products, int low, int middle, int high) {
		Product[] array = new Product[high-low];

		int current = 0;
		int left = low;
		int right = middle;

		while (left < middle && right < high) {
			if (products[left].getPrice() < products[right].getPrice()) {
				array[current] = products[left];
				left++;
			} else {
				array[current] = products[right];
				right++;
			}
			current++;
		}

		while (left < middle) {
			array[current] = products[left];
			left++;
			current++;
		}

		while (right < high) {
			array[current] = products[right];
			right++;
			current++;
		}

		for (int i = 0; i < current; i++ ) {
			products[low + i] = array[i];
		}

	}

}