/*
 * Kimberly M. Praxel
 * 11/06/16
 * IShippingRate.java
 */

package edu.greenriver.it.shippingratecalculators;

/**
 * Creates shipping rate for Customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public interface IShippingRate{
	
	/**
	 * calculates shipping rate
	 * 
	 * @param type - standard
	 * @param weight - of package
	 * @return Rate for shipping package 
	 */
	public Rate getRate(String type, double weight);

}
