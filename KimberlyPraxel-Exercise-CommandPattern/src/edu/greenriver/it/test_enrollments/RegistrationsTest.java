package edu.greenriver.it.test_enrollments;


import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


import edu.greenriver.it.commands.CommandType;
import edu.greenriver.it.commands.DropCommand;
import edu.greenriver.it.commands.ICommand;
import edu.greenriver.it.commands.RegisterCommand;
import edu.greenriver.it.registrations.GRClass;
import edu.greenriver.it.registrations.Student;


public class RegistrationsTest{

	private static Queue<ICommand> commandQueue = new LinkedBlockingQueue<ICommand>();
	private static Stack<ICommand> undoStack = new Stack<ICommand>();
	private static Scanner console = new Scanner(System.in);
	private static Student [] students;
	private static GRClass [] classes;


	public static void main(String [] args){

		// get some classes and students to test with
		students = getStudents();
		classes = getClasses();
		// present a menu to the user to give them actions to perform
		printMenuAndChoose();
	}


	public static void printMenuAndChoose(){
		
		while(true){
			printMenu();
			makeUserChoice();
		}
	}


	public static void printMenu(){
		// print commands as menu options
		CommandType [] types = CommandType.values();
		for(int i = 0; i < types.length; i++){
			System.out.println((i + 1) + ": " + types[i].toString());
		}

		// print an execute menu option
		System.out.println("x: execute all commands in the command queue");

		// print out an "undo" option
		System.out.println("z: undo");
	}


	public static void makeUserChoice(){

		// perform the user's choice
		String choice = console.nextLine();

		switch(choice){
		case "1":
			registerStudent();
			break;
		case "2":
			dropStudent();
			break;
		case "x":
			executeQueueOfCommands();
			break;
		case "z":
			
		}
	}
	
	public static void undoLastCommand(){
		
		if(!undoStack.isEmpty()){
			ICommand last = undoStack.pop();
			last.execute();
		}
	}


	public static void executeQueueOfCommands(){
		while(!commandQueue.isEmpty()){
			ICommand command = commandQueue.remove();
			command.execute();
			undoStack.push(command);
		}
	}


	public static void registerStudent(){
		ICommand register = new RegisterCommand(getStudentFromUser(), getClassFromUser());

		commandQueue.add(register);
	}


	public static void dropStudent(){
		ICommand drop = new DropCommand(getStudentFromUser(), getClassFromUser());

		commandQueue.add(drop);
	}


	public static Student getStudentFromUser(){
		System.out.print("Enter a studen name: ");
		String studentName = console.nextLine();
		// look for that student
		for(int i = 0; i < students.length; i++){
			if(students[i].getName().equals(studentName)){
				return students[i];
			}
		}
		throw new IllegalStateException("Error finding student: " + studentName);

	}


	public static GRClass getClassFromUser(){
		System.out.print("Enter a class name: ");
		String className = console.nextLine();
		// look for that student
		for(int i = 0; i < classes.length; i++){
			if(classes[i].getName().equals(className)){
				return classes[i];
			}
		}
		throw new IllegalStateException("Error finding class: " + className);
	}


	public static GRClass [] getClasses(){

		return new GRClass[]{ new GRClass("IT 426", "TC 120", 4), new GRClass("IT 333", "TC 206", 4),
				new GRClass("IT 301", "KC 309", 4)};
	}


	public static Student [] getStudents(){

		return new Student[]{ new Student("Lindsey"), new Student("Barrack"), new Student("Tyler"),
				new Student("Susan"), new Student("Joseph")};
	}

}
