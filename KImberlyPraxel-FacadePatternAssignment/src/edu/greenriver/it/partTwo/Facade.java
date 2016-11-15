/*
 * Kimberly M. Praxel
 * 10/27/16
 * Facade.java
 */

package edu.greenriver.it.partTwo;

import edu.greenriver.it.partOne.*;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public class Facade{
	
	
	/**
	 * validates any type from part one uses ValidationType
	 * 
	 * @param type - what type of data to validate
	 * @param subject - what to validate
	 * @return true if valid false if not
	 */
	public static boolean validate(ValidationType type, String subject){
		if (type == ValidationType.EMAIL){
			return StringRegex.isEmail(subject);
		} else if (type == ValidationType.ZIPCODE){
			return StringRegex.isZipCode(subject);
		} else if (type == ValidationType.PHONE_NUMBER){
			return StringRegex.isPhoneNumber(subject);
		} else if(type == ValidationType.URL){
			return StringRegex.isUrl(subject);
		} else {
			return false;
		}
	}
	
	/**
	 * method chaining
	 * 
	 * @param subject data to use
	 * @return new operator object
	 */
	public static Operator getOperator(String[] subject){
		return new Operator(subject);
	}
	
	/**
	 * enum with values for EMAIL, ZIPCODE, PHONE_NUMBER, and URL
	 */
	public enum ValidationType {
		EMAIL,
		ZIPCODE,
		PHONE_NUMBER,
		URL
	}
}
