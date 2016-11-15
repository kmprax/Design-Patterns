/*
 * Kimberly M. Praxel
 * 11/06/16
 * Driver.java
 */

package edu.greenriver.it.driver;


import java.text.DecimalFormat;
import java.util.Scanner;
import edu.greenriver.it.abstractfactory.EUOrderFactory;
import edu.greenriver.it.abstractfactory.IOrderFactory;
import edu.greenriver.it.abstractfactory.USOrderFactory;
import edu.greenriver.it.shippingratecalculators.Rate;


/**
 * Drives Factory Pattern Assignment
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class Driver{

	/**
	 * Main which starts program
	 * 
	 * @param args
	 */
	public static void main(String [] args){
		orderMaker();
	}


	/**
	 * Logic behind running the program gets user input and sends through
	 * factory pattern to determine cost of tax and shipping depending on user
	 * input
	 */
	public static void orderMaker(){
		Scanner console = new Scanner(System.in);
		int userRegionChoice = 0;

		System.out.println("Welcome to Order Maker");
		System.out.println("1: US");
		System.out.println("2: EU");
		System.out.println("Select shipping region: ");
		IOrderFactory order = null;
		userRegionChoice = console.nextInt();
		if(userRegionChoice == 1){
			System.out.println("Enter Zipcode: ");
			int zip = console.nextInt();
			console.nextLine();
			order = new USOrderFactory(zip);
		}else if(userRegionChoice == 2){
			System.out.println("Enter country: ");
			console.nextLine();
			String country = console.nextLine();
			country = country.toLowerCase();
			order = new EUOrderFactory(country);
		}
		
		System.out.println("Enter order name: ");
		String orderName = console.nextLine();
		orderName = orderName.toUpperCase();
		System.out.println("Enter subtotal: ");
		double subtotal = console.nextDouble();
		System.out.println("Enter weight: ");
		double weight = console.nextDouble();
		System.out.println("Enter shipping type (US: priority or standard) EU(standard only): ");
		String shippingType = console.next();
		shippingType = shippingType.toLowerCase();
		
		Rate shippingRate = order.getRateObject().getRate(shippingType, weight);
		double tax = order.getTaxObject().calculateTax(subtotal);
		double total = tax + subtotal + shippingRate.getRate();
		DecimalFormat usDollarFormat = new DecimalFormat("$###0.00");
		
		System.out.println("\n\nORDER NAME: " + orderName + " - WEIGHT: " + weight + "lbs - SHIPPING TYPE: "
				+ shippingType.toUpperCase());
		System.out.println("\nOrder Subtotal: " + usDollarFormat.format(subtotal) + "\nShipping Cost:   "
				+ usDollarFormat.format(shippingRate.getRate()) + "\nOrder Tax:       " + usDollarFormat.format(tax));
		System.out.println("	      --------\nOrder Total:    " + usDollarFormat.format(total));
	}
}
