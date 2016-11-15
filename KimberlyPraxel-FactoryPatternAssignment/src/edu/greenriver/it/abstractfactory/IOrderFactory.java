/*
 * Kimberly M. Praxel
 * 11/06/16
 * IOrderFactory.java
 */

package edu.greenriver.it.abstractfactory;

import edu.greenriver.it.shippingratecalculators.IShippingRate;
import edu.greenriver.it.taxcalculators.ISalesTax;

/**
 * Creates taxes and shipping rates for US and EU customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public interface IOrderFactory{
	
	/**
	 * Creates a collection of taxes for US and EU customers
	 * 
	 * @return the sales tax
	 */
	public ISalesTax getTaxObject();
	
	/**
	 * Creates the shipping cost for US and EU customers
	 * 
	 * @return shipping cost
	 */
	public IShippingRate getRateObject();
}
