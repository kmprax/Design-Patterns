/*
 * Kimberly M. Praxel
 * 11/13/16
 * HRCommand.java
 */


package edu.greenriver.it.hr.commands;


import edu.greenriver.it.hr.employees.Employee;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public abstract class HRCommand{

	protected Employee employee;


	/**
	 * Will execute a command
	 */
	public abstract void execute();


	/**
	 * Constructor for HRCommand gets employee
	 * 
	 * @param employee
	 *            Employee
	 */
	public HRCommand(Employee employee){
		this.employee = employee;
	}


}
