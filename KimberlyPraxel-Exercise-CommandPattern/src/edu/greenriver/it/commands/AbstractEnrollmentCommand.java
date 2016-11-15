package edu.greenriver.it.commands;

import edu.greenriver.it.registrations.GRClass;
import edu.greenriver.it.registrations.Student;

public abstract class AbstractEnrollmentCommand implements ICommand{
	
	protected Student student;
	protected GRClass aClass;
	protected boolean somethingChanged = false;
	
	public AbstractEnrollmentCommand(Student student, GRClass aClass){
		this.student = student;
		this.aClass = aClass;
	}
	
	public void registerStudent(){
		somethingChanged = aClass.registerStudent(student);
		System.out.println(student.getName() + " registered for "+ aClass.getName());
	}
	
	public void dropStudent(){
		somethingChanged = aClass.dropStudent(student);
		System.out.println(student.getName() + " dropped from "+ aClass.getName());
	}

}
