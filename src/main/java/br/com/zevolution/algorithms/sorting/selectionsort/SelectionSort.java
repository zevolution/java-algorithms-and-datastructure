package br.com.zevolution.algorithms.sorting.selectionsort;

public class SelectionSort {
	
	public static Product[] sortingByCheapest(Product[] products, int length) {
		Product[] array = products.clone();
		for (int current = 0; current < length - 1; current++) {
			int cheapest = getCheapest(array, current, length - 1);

			Product currentProduct = array[current];
			Product cheapestProduct = array[cheapest];

			array[current] = cheapestProduct;
			array[cheapest] = currentProduct;
		}
		return array;
	}

	private static int getCheapest(Product[] products, int beginIndex, int endIndex) {
		int cheapest = beginIndex;
		for (int current = beginIndex; current <= endIndex; current++) {
			if (products[current].getPrice() < products[cheapest].getPrice()) {
				cheapest = current;
			}		
		}
		return cheapest;
	}
}
