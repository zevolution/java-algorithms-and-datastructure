package br.com.zevolution.algorithms.sorting;

import static br.com.zevolution.algorithms.sorting.SortingTestData.*;
import static org.junit.Assert.*;

import java.util.Arrays;

public class SortTester {

	public static void testSort(Sort sorter) {
		assertArrayEquals(SORTED_BY_LOWEST_PRICE, sorter.sort(SORTED_BY_HIGHEST_PRICE, SORTED_BY_HIGHEST_PRICE.length));
		assertArrayEquals(SORTED_BY_LOWEST_PRICE, sorter.sort(SORTED_BY_LOWEST_PRICE, SORTED_BY_LOWEST_PRICE.length));
		assertArrayEquals(SORTED_BY_LOWEST_PRICE, sorter.sort(NOT_SORTED, NOT_SORTED.length));
		assertArrayEquals(SAME_PRODUCT, sorter.sort(SAME_PRODUCT, SAME_PRODUCT.length));

		// Make sure which original array it's not modified
		sorter.sort(NOT_SORTED, NOT_SORTED.length);
		assertFalse(Arrays.equals(SORTED_BY_LOWEST_PRICE, NOT_SORTED));
	}

}