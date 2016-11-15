/*
 * Kimberly M. Praxel
 * 10/20/16
 * Writer.java
 */


package edu.greenriver.it.fileio;

import edu.greenriver.it.products.Product;

public interface Writer{
	
	/**
	 * writes product object to a file
	 * @param object 
	 */
	public void saveObject(Product object);

	/**
	 * reads file 
	 * @param name
	 * @return product file
	 */
	public Product loadObject(String name);

}
