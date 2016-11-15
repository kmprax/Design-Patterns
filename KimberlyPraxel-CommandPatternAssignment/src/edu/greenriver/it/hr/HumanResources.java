/*
 * Kimberly M. Praxel
 * 11/13/16
 * HumanResources.java
 */

package edu.greenriver.it.hr;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import edu.greenriver.it.hr.commands.AddEmployee;
import edu.greenriver.it.hr.commands.BackgroundCheck;
import edu.greenriver.it.hr.commands.ChangeEmployeeType;
import edu.greenriver.it.hr.commands.ConsoleOutput;
import edu.greenriver.it.hr.commands.HRCommand;
import edu.greenriver.it.hr.commands.ReferenceCheck;
import edu.greenriver.it.hr.employees.Employee;

/**
 * Stores commands and manages them.
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class HumanResources{
	// list of commands to complete (first come, first serve)
	private List<HRCommand> todos = new ArrayList<HRCommand>();

	// list of Employees
	private Map<String,Employee> namesToApplicants = new TreeMap<String,Employee>();


	// public methods

	public void testHiringProcess(){
		// add command items for adding 10 new applicants to our HR system
		Employee employee1 = new Employee("Mary Poppins");
		Employee employee2 = new Employee("Harry Potter");
		Employee employee3 = new Employee("Michael Banks");
		Employee employee4 = new Employee("Jane Banks");
		Employee employee5 = new Employee("Bert Alfred");
		Employee employee6 = new Employee("Albus Dumbledore");
		Employee employee7 = new Employee("Severus Snape");
		Employee employee8 = new Employee("Hermione Granger");
		Employee employee9 = new Employee("Sirius Black");
		Employee employee10 = new Employee("Rubeus Hagrid");
		Employee employee11 = new Employee("Frodo Baggins");

		Employee [] newHire = { employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8,
				employee9, employee10, employee11};


		for(Employee employee: newHire){
			todos.add(new ConsoleOutput(employee));
			todos.add(new BackgroundCheck(employee));
			todos.add(new ReferenceCheck(employee));
			todos.add(new ChangeEmployeeType(employee));
			todos.add(new AddEmployee(employee));
		}


		// print new employees
		for(HRCommand command: todos){
			command.execute();
		}
		
		// print toString()
		for(Employee employee : newHire){
			System.out.println(employee.toString());
		}
	}


	public void addApplicant(Employee employee){
		namesToApplicants.put(employee.getName(), employee);
	}
}
