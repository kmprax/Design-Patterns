/*
 * Kimberly M. Praxel
 * 11/13/16
 * BackgroundCheck.java
 */

package edu.greenriver.it.hr.commands;

import edu.greenriver.it.hr.OfficeStaff;
import edu.greenriver.it.hr.employees.Employee;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class BackgroundCheck extends HRCommand{

	/**
	 * Background Check Constructor
	 * @param employee
	 */
	public BackgroundCheck(Employee employee){
		super(employee);
	}
	
    /**
     * Executes a command for an employee
     */
	@Override
	public void execute(){
		OfficeStaff.backgroundCheck(this.employee);
	}
	
}
