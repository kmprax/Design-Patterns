/*
 * Kimberly M. Praxel
 * 11/06/16
 * USOrderFactory.java
 */

package edu.greenriver.it.abstractfactory;

import edu.greenriver.it.shippingratecalculators.IShippingRate;
import edu.greenriver.it.shippingratecalculators.USShippingRate;
import edu.greenriver.it.taxcalculators.ISalesTax;
import edu.greenriver.it.taxcalculators.USSalesTax;

/**
 * Creates taxes and shipping rates for US customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class USOrderFactory implements IOrderFactory{

	private int zipcode;

	/**
	 * creates a new USOrderFactory
	 * 
	 * @param zipcode - zipcode
	 */
	public USOrderFactory(int zipcode) {
		this.zipcode = zipcode;
	}
	
	/**
	 * creates a collection of tax for US customers
	 * 
	 * @return sales tax
	 */
	@Override
	public ISalesTax getTaxObject(){
		return new USSalesTax(zipcode);
	}
	
	/**
	 * creates shipping rates for US customers
	 * 
	 * @return shipping rate
	 */
	@Override
	public IShippingRate getRateObject(){
		return new USShippingRate();
	}
}
