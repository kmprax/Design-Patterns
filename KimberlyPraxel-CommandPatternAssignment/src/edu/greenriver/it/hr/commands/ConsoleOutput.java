/*
 * Kimberly M. Praxel
 * 11/13/16
 * ConsoleOutput.java
 */


package edu.greenriver.it.hr.commands;


import edu.greenriver.it.hr.employees.Employee;


/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class ConsoleOutput extends HRCommand{

	/**
	 * Console Output Constructor
	 * 
	 * @param employee
	 */
	public ConsoleOutput(Employee employee){
		super(employee);
	}


	/**
	 * Executes a command for an employee
	 */
	@Override
	public void execute(){
		System.out.println("Hiring new employee: " + employee.getName());
	}

}
