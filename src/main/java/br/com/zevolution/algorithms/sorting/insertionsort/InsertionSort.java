package br.com.zevolution.algorithms.sorting.insertionsort;

public class InsertionSort {

	public static Product[] sortingByCheapest(Product[] products, int length) {
		Product[] array = products.clone();
		for (int current = 1; current < length; current++) {
			int beingAnalyzed = current;

			while (beingAnalyzed > 0) {
				int previousBeingAnalyzed = beingAnalyzed - 1;

				Product currentProductBeingAnalyzed = array[beingAnalyzed];
				Product previousProductBeingAnalyzed = array[previousBeingAnalyzed];
				if (currentProductBeingAnalyzed.getPrice() < previousProductBeingAnalyzed.getPrice()) {
					array[beingAnalyzed] = previousProductBeingAnalyzed;
					array[previousBeingAnalyzed] = currentProductBeingAnalyzed;

					beingAnalyzed--;
				} else {
					break;
				}
			}
		}
		return array;
	}
}