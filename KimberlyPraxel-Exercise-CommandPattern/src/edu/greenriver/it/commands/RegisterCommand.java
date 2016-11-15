package edu.greenriver.it.commands;

import edu.greenriver.it.registrations.GRClass;
import edu.greenriver.it.registrations.Student;

public class RegisterCommand extends AbstractEnrollmentCommand{
	
	
	public RegisterCommand(Student student, GRClass aClass){
		super(student, aClass);
	}

	@Override
	public void execute(){
		
		// register a student for a class
		registerStudent();
	}

	@Override
	public void unexecute(){
		
		if(somethingChanged){
			dropStudent();
		}
		
	}

}
