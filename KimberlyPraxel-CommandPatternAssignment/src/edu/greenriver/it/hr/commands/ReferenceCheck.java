/*
 * Kimberly M. Praxel
 * 11/13/16
 * ReferenceCheck.java
 */


package edu.greenriver.it.hr.commands;


import edu.greenriver.it.hr.OfficeStaff;
import edu.greenriver.it.hr.employees.Employee;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class ReferenceCheck extends HRCommand{
	
	/**
	 * Reference Check Constructor
	 * @param employee
	 */
	public ReferenceCheck(Employee employee){
		super(employee);
	}

    /**
     * Executes a command for an employee
     */
	@Override
	public void execute(){
		OfficeStaff.referenceCheck(employee);
	}

}
