/*
 * Kimberly M. Praxel
 * 11/06/16
 * Rate.java
 */

package edu.greenriver.it.shippingratecalculators;


/**
 * Creates shipping rate for customers using shippingType either priority or
 * standard and the cost to ship based off weight
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class Rate{

	private String shippingType;
	private double rate;

	/**
	 * creates a rate object
	 * 
	 * @param shippingType - standard or priority
	 * @param rate - cost of shipping 
	 */
	public Rate(String shippingType, double rate){
		this.shippingType = shippingType;
		this.rate = rate;
	}

	/**
	 * gets the shipping type
	 * 
	 * @return shippingType - standard or priority
	 */
	public String getShippingType(){
		return shippingType;
	};

	/**
	 * gets the cost of shipping
	 * 
	 * @return rate - cost of shipping
	 */
	public double getRate(){
		return rate;
	}

}
