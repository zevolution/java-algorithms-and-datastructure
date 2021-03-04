package br.com.zevolution.algorithms.sorting.mergesort;

import static br.com.zevolution.algorithms.sorting.SortTester.testSort;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void should_Sort_Array() {
		testSort(new MergeSort());
	}

}
