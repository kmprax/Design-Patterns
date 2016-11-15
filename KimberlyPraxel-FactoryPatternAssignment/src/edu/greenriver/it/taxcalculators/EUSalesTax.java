/*
 * Kimberly M. Praxel
 * 11/06/16
 * EUSalesTax.java
 */

package edu.greenriver.it.taxcalculators;

import java.util.*;

/**
 * Creates sales tax for EU Customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class EUSalesTax implements ISalesTax{

	private String region;

	/**
	 * creates a new EUSalesTax
	 * 
	 * @param region - EU country
	 */
	public EUSalesTax(String region) {
		this.region = region;
	}
	
	/**
	 * tax calculations based on country
	 * 
	 * @param salesSubTotal
	 * @return calculated tax
	 */
	@Override
	public double calculateTax(double salesSubTotal){
		HashMap<String,Double> euTaxRates = new  HashMap<String,Double>();
		
		euTaxRates.put("austria", new Double(0.20));
		euTaxRates.put("belgium", new Double(0.21));
		euTaxRates.put("bulgaria", new Double(0.20));
		euTaxRates.put("croatia", new Double(0.25));
		euTaxRates.put("cyprus", new Double(0.19));
		euTaxRates.put("czech republic", new Double(0.21));
		euTaxRates.put("denmark", new Double(0.25));
		euTaxRates.put("estonia", new Double(0.20));
		euTaxRates.put("finland", new Double(0.24));
		euTaxRates.put("france", new Double(0.20));
		euTaxRates.put("germany", new Double(0.19));
		euTaxRates.put("greece", new Double(0.24));
		euTaxRates.put("hungary", new Double(0.27));
		euTaxRates.put("ireland", new Double(0.23));
		euTaxRates.put("italy", new Double(0.22));
		euTaxRates.put("latvia", new Double(0.21));
		euTaxRates.put("lithuania", new Double(0.21));
		euTaxRates.put("luxembourg", new Double(0.17));
		euTaxRates.put("malta", new Double(0.18));
		euTaxRates.put("netherlands", new Double(0.21));
		euTaxRates.put("poland", new Double(0.23));
		euTaxRates.put("portugal", new Double(0.23));
		euTaxRates.put("romania", new Double(0.20));
		euTaxRates.put("slovakia", new Double(0.20));
		euTaxRates.put("slovenia", new Double(0.22));
		euTaxRates.put("spain", new Double(0.25));
		euTaxRates.put("sweden", new Double(0.25));
		euTaxRates.put("united kingdom", new Double(0.20));
		
		double currentTaxRate = euTaxRates.get(region);
		 
		return salesSubTotal * currentTaxRate;
	}
	

}
