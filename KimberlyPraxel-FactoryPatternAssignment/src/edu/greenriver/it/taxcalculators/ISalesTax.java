/*
 * Kimberly M. Praxel
 * 11/06/16
 * ISalesTax.java
 */

package edu.greenriver.it.taxcalculators;

/**
 * Creates sales tax
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public interface ISalesTax{
	
	/**
	 * Creates tax calculations
	 * 
	 * @param salesSubTotal
	 * @return correct tax 
	 */
	public double calculateTax(double salesSubTotal);

}
