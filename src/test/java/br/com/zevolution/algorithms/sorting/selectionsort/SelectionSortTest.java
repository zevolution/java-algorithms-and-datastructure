package br.com.zevolution.algorithms.sorting.selectionsort;

import static br.com.zevolution.algorithms.sorting.SortTester.testSort;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void should_Sort_Array() {
		testSort(new SelectionSort());
	}
	
}
