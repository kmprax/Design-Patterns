/*
 * Kimberly M. Praxel
 * 11/13/16
 * AddEmployee.java
 */

package edu.greenriver.it.hr.commands;


import edu.greenriver.it.hr.HumanResources;
import edu.greenriver.it.hr.employees.Employee;


/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class AddEmployee extends HRCommand{

	private HumanResources HRReciever = new HumanResources();


	/**
	 * AddEmployee Constructor
	 * 
	 * @param employee
	 */
	public AddEmployee(Employee employee){
		super(employee);
	}


	/**
	 * Executes a command for an employee
	 */
	@Override
	public void execute(){
		HRReciever.addApplicant(employee);
		System.out.println("New employee added to system\n");
	}
}
