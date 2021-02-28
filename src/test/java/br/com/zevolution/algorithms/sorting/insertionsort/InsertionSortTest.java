package br.com.zevolution.algorithms.sorting.insertionsort;

import static br.com.zevolution.algorithms.sorting.SortTester.testSort;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void should_Sort_Array() {
		testSort(new InsertionSort());
	}

}
