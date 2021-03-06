package br.com.zevolution.algorithms.sorting.quicksort;

import static br.com.zevolution.algorithms.sorting.SortTester.testSort;
import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void should_Sort_Array() {
		testSort(new QuickSort());
	}

}
