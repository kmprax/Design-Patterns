/*
 * Kimberly M. Praxel
 * 10/27/16
 * StringRegex.java
 */

package edu.greenriver.it.partOne;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public class StringRegex{
	
	/**
	 * takes string checks to see if valid 
	 * 
	 * @param subject - string to check
	 * @return true if valid false if not
	 */
	public static boolean isEmail(String subject){
		return subject.matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");
	}
	
	/**
	 * takes string checks to see if valid 
	 * 
	 * @param subject - string to check
	 * @return true if valid false if not
	 */
	public static boolean isZipCode(String subject){
		return subject.matches("^\\d{5}(-\\d{4})?$");

	}
	
	/**
	 * takes string checks to see if valid 
	 * 
	 * @param subject - string to check
	 * @return true if valid false if not
	 */
	public static boolean isPhoneNumber(String subject){
		return subject.matches("^(\\d{3}-?\\d{3}-?\\d{4})$");

	}
	
	/**
	 * takes string checks to see if valid 
	 * 
	 * @param subject - string to check
	 * @return true if valid false if not
	 */
	public static boolean isUrl(String subject){
		return subject.matches("^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$");
	}
}
