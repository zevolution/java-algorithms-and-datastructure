package br.com.zevolution.algorithms.sorting.insertionsort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.zevolution.algorithms.sorting.insertionsort.Product;
import br.com.zevolution.algorithms.sorting.insertionsort.InsertionSort;

public class InsertionSortTest {

	private static final double CHEAPEST_PRODUCT = 5;
	private static final double MOST_EXPENSIVE_PRODUCT = 50;
	private Product[] products;

	@Before
	public void init() {
		Product[] array = {
				new Product("iMac", MOST_EXPENSIVE_PRODUCT),
				new Product("iPhone", 8),
				new Product("Notebook", 7),
				new Product("Keyboard", 9),
				new Product("Mouse", CHEAPEST_PRODUCT)
		};
		this.products = array;
	}

	@Test
	public void should_Get_CheapestProduct() {
		Product[] ordened = InsertionSort.sortingByCheapest(this.products, this.products.length);
		assertEquals(CHEAPEST_PRODUCT, ordened[0].getPrice(), 0);
	}

	@Test
	public void should_Get_MostExpensiveProduct() {
		Product[] ordened = InsertionSort.sortingByCheapest(this.products, this.products.length);
		assertEquals(MOST_EXPENSIVE_PRODUCT, ordened[ordened.length - 1].getPrice(), 0);
	}

}
