package edu.greenriver.it.hr.employees;


public class Employee{
	private String name;
	private EmployeeType type;


	public Employee(String name){
		this.name = name;
	}


	// getters/setters

	public String getName(){
		return name;
	}


	public void setName(String name){
		this.name = name;
	}


	public EmployeeType getType(){
		return type;
	}


	public void setType(EmployeeType type){
		this.type = type;
	}


	public String toString(){
		return name + " (" + type + ")";
	}
}
