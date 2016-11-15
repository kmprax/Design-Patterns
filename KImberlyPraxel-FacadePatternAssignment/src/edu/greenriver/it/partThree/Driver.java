/*
 * Kimberly M. Praxel
 * 10/27/16
 * Driver.java
 */

package edu.greenriver.it.partThree;

import edu.greenriver.it.partTwo.*;
import edu.greenriver.it.partTwo.Facade.ValidationType;


import java.util.*;


/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public class Driver{

	/**
	 * Runs test required to ensure Facade Pattern is working correct.
	 */
	public static void main(String [] args){
		runTests();
		
	}
	
	/**
	 * Program so you can run multiple tests 
	 */
	public static void runTests(){
		int userChoice = 0;
		while(userChoice != 4){
		System.out.println("Select Number of what test to run");
		System.out.println("1. Test Emails");
		System.out.println("2. Test Zip Codes");
		System.out.println("3. Reduce Array");
		System.out.println("4. Exit");
		Scanner console = new Scanner(System.in);
		System.out.print("Make your Selection: ");
		userChoice = console.nextInt();
		if(userChoice == 1){
			testEmails();
			System.out.println();
		}else if(userChoice == 2){
			testZipCodes();
			System.out.println();
		}else if(userChoice == 3){
			reduceArray();
			System.out.println();
		}else if(userChoice == 4){
			System.exit(0);
		}else{
			System.out.println("Please enter valid number 1 - 4");
		}
		}
	}
	

	/**
	 * Test emails to check if valid or not
	 */
	public static void testEmails(){
		System.out.println("Check Emails");
		System.out.println("------------");
		String [] emails = new String[]{ "my_email@gmail.com", "e@e.com", "catch@22@.msn.com"};
		for (int i = 0; i < emails.length; i++){
			System.out.print(emails[i] + " is a valid email: ");
			boolean valid = Facade.validate(ValidationType.EMAIL, emails[i]);
			System.out.println(valid);
		}
	}

	/**
	 * Tests zipCodes to check if valid or not
	 */
	public static void testZipCodes(){
		System.out.println("Check Zip Codes");
		System.out.println("----------------");
		String [] zipCodes = new String[]{ "99999", "88888-0000", "9999", "xxxxx"};
		for (int i = 0; i < zipCodes.length; i++){
			System.out.print(zipCodes[i] + " is a valid Zip Code: ");
			boolean valid = Facade.validate(ValidationType.ZIPCODE, zipCodes[i]);
			System.out.println(valid);
		}
	}

	/**
	 * Takes an array and removes elements of yellow and resize to 5
	 */
	public static void reduceArray(){
		System.out.println("\nReduce Array");
		System.out.println("-------------");
		String [] colorArray = new String[]{"blue", "red", "white", "blue", "yellow", "yellow", " ", "red", "red"};
		System.out.println(Arrays.toString(colorArray));
		String [] newColorArray = Facade.getOperator(colorArray).filter("yellow").resize(5).getSubject();
		System.out.println(Arrays.toString(newColorArray));
	}
}
