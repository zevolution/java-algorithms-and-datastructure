package br.com.zevolution.algorithms.sorting;

public class SortingTestData {

	public static final Product[] SORTED_BY_LOWEST_PRICE = {
			new Product("Mouse", 50),
			new Product("Keyboard", 100),
			new Product("Notebook", 3500),
			new Product("iPhone 12 Pro Max Ultra Uou", 10000),
			new Product("iMac", 30000)
	};

	public static final Product[] SORTED_BY_HIGHEST_PRICE = {
			new Product("iMac", 30000),
			new Product("iPhone 12 Pro Max Ultra Uou", 10000),
			new Product("Notebook", 3500),
			new Product("Keyboard", 100),
			new Product("Mouse", 50)
	};

	public static final Product[] NOT_SORTED = {
			new Product("iPhone 12 Pro Max Ultra Uou", 10000),
			new Product("Keyboard", 100),
			new Product("Notebook", 3500),
			new Product("Mouse", 50),
			new Product("iMac", 30000)
	};

	public static final Product[] SAME_PRODUCT = {
			new Product("Mouse", 50),
			new Product("Mouse", 50),
			new Product("Mouse", 50),
			new Product("Mouse", 50),
			new Product("Mouse", 50)
	};

}
