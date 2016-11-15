/*
 * Kimberly M. Praxel
 * 10/27/16
 * StringOperation.java
 */

package edu.greenriver.it.partOne;

import java.util.*;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public class StringOperation{
	
	
	/**
	 * Removes all duplicates from an array
	 * 
	 * @param values - Accepts a string array
	 * @return  a new array with all duplicates removed.
	 */
	public static String[] removeDuplicates(String[] values){
		HashSet<String> valuesSet = new HashSet<String>();
		for(int i = 0; i < values.length; i++){
			valuesSet.add(values[i]);
		}
		String[] newValues = new String[valuesSet.size()];
		int index = 0;
		for(int i = 0; i < values.length; i++){
			if(valuesSet.contains(values[i])){
				newValues[index] = values[i];
				valuesSet.remove(values[i]);
				index++;
			}
		}
		return newValues;
	}
	
	
	/**
	 * Takes an array and resizes to specified size
	 * 
	 * @param values - Accepts a string array
	 * @param newLength - int for new array size
	 * @return a new array with given size
	 */
	public static String[] resize(String[] values, int newLength){
		String[] newValues = new String[newLength];
		for(int i = 0; i <values.length && i < newValues.length; i++){
			newValues[i] = values[i];
		}
		return newValues;		
	}
	
	
	/**
	 * removes all instances of a given search from array
	 * 
	 * @param values - Accepts a string array
	 * @param search - search value from the given string array
	 * @return a new array with the search removed
	 */
	public static String[] filter(String[] values, String search){
		int instances = 0;
		for(int i = 0; i <values.length; i++){
			if(values[i].equals(search)){
				instances++;
			}
		}
		
		String[] newValues = new String[values.length + instances];
		int index = 0;
		for(int i = 0; i < values.length; i++){
			if(!values[i].equals(search)){
				newValues[index] = values[i];
				index++;
			}
		}
		return newValues;
	}

}
