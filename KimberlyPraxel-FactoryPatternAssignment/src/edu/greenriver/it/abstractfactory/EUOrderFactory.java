/*
 * Kimberly M. Praxel
 * 11/06/16
 * EUOrderFactory.java
 */

package edu.greenriver.it.abstractfactory;

import edu.greenriver.it.shippingratecalculators.EUShippingRate;
import edu.greenriver.it.shippingratecalculators.IShippingRate;
import edu.greenriver.it.taxcalculators.EUSalesTax;
import edu.greenriver.it.taxcalculators.ISalesTax;

/**
 * Creates taxes and shipping rates for EU customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class EUOrderFactory implements IOrderFactory{
	
	private String region;

	/**
	 * creates a new EUOrderFactory
	 * 
	 * @param region - EU country name 
	 */
	public EUOrderFactory(String region) {
		this.region = region;
	}
	
	/**
	 * creates a collection of tax for EU customers
	 * 
	 * @return sales tax
	 */
	@Override
	public ISalesTax getTaxObject() {
		return new EUSalesTax(region);
	}
	
	/**
	 * creates shipping rates for EU customers
	 * 
	 * @return shipping rate
	 */
	@Override
	public IShippingRate getRateObject() {
		return new EUShippingRate();
	}
}
