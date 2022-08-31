package com.masai.Question2;

import java.util.Comparator;

public class SortProductPriceDescendingOrder implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductPrice()>o2.getProductPrice() ? +1 : -1;
	}
	
}
