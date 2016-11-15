/*
 * Kimberly M. Praxel
 * 11/06/16
 * EUShippingRate.java
 */

package edu.greenriver.it.shippingratecalculators;

/**
 * Creates shipping rate for EU Customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class EUShippingRate implements IShippingRate{
	
	/**
	 * calculates shipping rate for EU shipping
	 * 
	 * @param type - standard
	 * @param weight - of package
	 * @return Rate for shipping package 
	 */
	public Rate getRate(String type, double weight) {
		return new Rate("standard", weight * 0.5);	
	}
}
