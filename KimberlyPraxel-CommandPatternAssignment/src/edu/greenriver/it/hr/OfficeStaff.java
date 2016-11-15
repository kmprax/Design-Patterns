/*
 * Kimberly M. Praxel
 * 11/13/16
 * OfficeStaff.java
 */

package edu.greenriver.it.hr;

import edu.greenriver.it.hr.employees.Employee;
import edu.greenriver.it.hr.employees.EmployeeType;

/**
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class OfficeStaff
{
    //private static Random random = new Random();
    
    /**
     * Checks the background of employee
     * @param employee
     */
	public static void backgroundCheck(Employee employee)
    {
    	//100% chance to come back "good"
    	System.out.println("Starting background check... success!");
    }
    
    /**
     * Checks the references of employee
     * @param employee
     */
    public static void referenceCheck(Employee employee)
    {
        //100% chance to be a good reference
    	System.out.println("Starting reference check... success!");
    }
    
    /**
     * Sets the Employee Type
     * @param employee
     * @param type
     */
    public static void changeEmployeeStatus(Employee employee, EmployeeType type)
    {
        employee.setType(type);
    }
}
