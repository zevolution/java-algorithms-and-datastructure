package br.com.zevolution.algorithms.sorting.selectionsort;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.zevolution.algorithms.sorting.Product;

public class SelectionSortTest {

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
		Product[] ordened = SelectionSort.sortingByCheapest(this.products, this.products.length);
		assertEquals(CHEAPEST_PRODUCT, ordened[0].getPrice(), 0);
	}

	@Test
	public void should_Get_MostExpensiveProduct() {
		Product[] ordened = SelectionSort.sortingByCheapest(this.products, this.products.length);
		assertEquals(MOST_EXPENSIVE_PRODUCT, ordened[ordened.length - 1].getPrice(), 0);
	}

}
