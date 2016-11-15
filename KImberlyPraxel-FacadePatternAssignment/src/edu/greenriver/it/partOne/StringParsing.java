/*
 * Kimberly M. Praxel
 * 10/27/16
 * StringParsing.java
 */

package edu.greenriver.it.partOne;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public class StringParsing{
	
	/**
	 * Takes String returns everything before the first delimiter
	 * 
	 * @param subject - string to split
	 * @param delimiter - where to split
	 * @return everything before the split
	 */
	public static String before(String subject, String delimiter){
		String[] parts = subject.split(delimiter, 2);
		return parts[0];
	}
	
	/**
	 * Takes String returns everything after the first delimiter
	 * 
	 * @param subject - string to split
	 * @param delimiter - where to split
	 * @return everything after the split
	 */
	public static String after(String subject, String delimiter){
		String [] parts = subject.split(delimiter, 2);
		if(parts.length < 2){
			return subject;
		}else{
			return parts[1];
		}
	}
}
