/*
 * Kimberly M. Praxel
 * 11/13/16
 * ChangeEmployeeType.java
 */

package edu.greenriver.it.hr.commands;


import java.util.Random;


import edu.greenriver.it.hr.OfficeStaff;
import edu.greenriver.it.hr.employees.Employee;
import edu.greenriver.it.hr.employees.EmployeeType;


/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class ChangeEmployeeType extends HRCommand{

	/**
	 * Change Employee Type Constructor
	 * 
	 * @param employee
	 */
	public ChangeEmployeeType(Employee employee){
		super(employee);
	}


	/**
	 * Executes a command for an employee
	 */
	@Override
	public void execute(){
		Random number = new Random();
		int randomNumber = number.nextInt(2) + 1;
		if(randomNumber == 1){
			OfficeStaff.changeEmployeeStatus(employee, EmployeeType.SALARY);
		}else{
			OfficeStaff.changeEmployeeStatus(employee, EmployeeType.HOURLY);
		}
		System.out.println("Employee status changed to " + employee.getType());
	}

}
