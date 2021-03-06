package br.com.zevolution.algorithms.sorting.quicksort;

import br.com.zevolution.algorithms.sorting.Product;
import br.com.zevolution.algorithms.sorting.Sort;

public class QuickSort implements Sort {

	@Override
	public Product[] sort(Product[] products, int length) {
		Product[] array = products.clone();
		this.quickSort(array, 0, length);
		return array;

	}

	private void quickSort(Product[] products, int start, int end) {
		int length = end - start; 
		if (length > 1) {
			int pivot = this.partitionProducts(products, start, end);
			this.quickSort(products, start, pivot);
			this.quickSort(products, pivot + 1, end);
		}
	}

	private int partitionProducts(Product[] products, int start, int end) {
		int cheapest = start;

		Product pivotProduct = products[end - 1];
		for (int current = start; current < end - 1; current++) {
			Product currentProduct = products[current];
			if (currentProduct.getPrice() <= pivotProduct.getPrice()) {
				this.swap(products, current, cheapest);
				cheapest++;
			}
		}

		this.swap(products, end - 1, cheapest);

		return cheapest;
	}

	private void swap(Product[] products, int from, int to) {
		Product productFrom = products[from];
		Product productTo = products[to];
		products[from] = productTo;
		products[to] = productFrom;
	}

}