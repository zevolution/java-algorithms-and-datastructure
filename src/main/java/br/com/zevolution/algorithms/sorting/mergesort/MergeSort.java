package br.com.zevolution.algorithms.sorting.mergesort;

import br.com.zevolution.algorithms.sorting.Product;
import br.com.zevolution.algorithms.sorting.Sort;

public class MergeSort implements Sort {

	public Product[] sort(Product[] products, int length) {
		Product[] array = products.clone();
		mergeSort(array, 0, length);
		return array;
	}

	private void mergeSort(Product[] products, int start, int end) {
		int length = end - start;

		if (length > 1) {
			int middle = (start + end) >> 1;

			mergeSort(products, start, middle);
			mergeSort(products, middle, end);
			mergeSort(products, start, middle, end);
		}
	}

	private void mergeSort(Product[] products, int low, int middle, int high) {
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