/*
 * Kimberly M. Praxel
 * 11/06/16
 * USShippingRate.java
 */

package edu.greenriver.it.shippingratecalculators;


/**
 * Creates shipping rate for US Customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class USShippingRate implements IShippingRate{

	/**
	 * calculates shipping rate for US shipping
	 * 
	 * @param type - standard or priority
	 * @param weight - of package
	 * @return Rate for shipping package 
	 */
	public Rate getRate(String type, double weight){

		if(type.equals("priority")){
			return new Rate("priority", weight * 3.00);
		}else if(type.equals("standard")){
			if(weight < 1){
				return new Rate("standard", 1.00);
			}else if(weight < 6){
				return new Rate("standard", 5.00);
			}else if(weight <= 10){
				return new Rate("standard", 10.00);
			}else{
				return new Rate("standard", 15.00);
			}
		}
		return null;
	}
}
