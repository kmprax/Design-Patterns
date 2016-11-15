package edu.greenriver.it.commands;

import edu.greenriver.it.registrations.GRClass;
import edu.greenriver.it.registrations.Student;

public class DropCommand extends AbstractEnrollmentCommand{

	
	
	public DropCommand(Student student, GRClass aClass){
		super(student, aClass);
	}

	@Override
	public void execute(){
		
		//drop a student from the class
		dropStudent();
	}

	@Override
	public void unexecute(){
		
		if(!somethingChanged){
			registerStudent();
		}
		
	}
	
}
