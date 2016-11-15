/*
 * Kimberly M. Praxel
 * 10/27/16
 * Operator.java
 */

package edu.greenriver.it.partTwo;

import edu.greenriver.it.partOne.*;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class Operator{
	
	private String[] subject;
	
	/**
	 * new operator 
	 * 
	 * @param subject
	 */
	public Operator(String[] subject){
		this.subject = subject;
	}
	
	/**
	 * gets subject
	 * 
	 * @return subject
	 */
	public String[] getSubject(){
	return subject;
	}
	
	/**
	 * removes instances of the search from subject 
	 * 
	 * @param search what to remove
	 * @return new operator with search data removed
	 */
	public Operator filter(String search){
		return new Operator(StringOperation.filter(subject, search));
	}
	
	/**
	 * removes duplicates from subject
	 * 
	 * @return new operator without duplicates
	 */
	public Operator removeDuplicates(){
		return new Operator(StringOperation.removeDuplicates(subject));
	}
	
	/**
	 * resizes subject to given size
	 * 
	 * @param length length of new subject array
	 * @return new operator at new size
	 */
	public Operator resize(int length){
		return new Operator(StringOperation.resize(subject, length));
	}
}
