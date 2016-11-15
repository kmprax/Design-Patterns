package edu.greenriver.it.registrations;


import java.util.*;


public class GRClass{

	// track # of seats, class name & location, enrolled students
	private String name;
	private String location;
	private int seats;

	// students enrolled or on the waiting list
	private List<Student> enrolledStudents = new ArrayList<Student>();
	private List<Student> waitListedStudents = new ArrayList<Student>();


	public GRClass(String name, String location, int seats){
		this.name = name;
		this.location = location;
		this.seats = seats;
	}


	public boolean registerStudent(Student student){
		if(!hasStudent(student)){
			// is the class full?
			if(enrolledStudents.size() == seats){
				//add the student to the wait list
				waitListedStudents.add(student);
			}else{
				enrolledStudents.add(student);
			}
			return true;
		}
		return false;
	}


	public boolean dropStudent(Student student){
		if(hasStudent(student)){
			//wait list
			if(waitListedStudents.contains(student)){
				waitListedStudents.remove(student);
			}else{//we know the student is enrolled at this point
				//remove enrolled student
				enrolledStudents.remove(student);
				//if wait list 
				if(waitListedStudents.size() > 0){
					//add first person on wait list to class
					enrolledStudents.add(waitListedStudents.get(0));
				}
			}
			return true;
		}
		return false;
	}


	// step down function
	public boolean hasStudent(Student student){
		// determine if a student is enrolled or on the wait list
		return enrolledStudents.contains(student) || waitListedStudents.contains(student);
	}


	public String getName(){
		return name;
	}


	public String getLocation(){
		return location;
	}


	public int getSeats(){
		return seats;
	}


	public List<Student> getEnrolledStudents(){
		// can I change the array list here outside this class? Answer Yes

		// what are our alternatives?
		// 1. return a copy of the array list(down side uses memory)
		// 2. use the clone() on array list (down side uses too much memory)
		// 3. use a read-only wrapper class
		// return enrolledStudents; <--bad

		// allows me to view list but not change the contents of list
		return Collections.unmodifiableList(enrolledStudents);// <--good
	}


	public List<Student> getWaitListedStudents(){
		// can I change the array list here outside this class? Answer Yes

		// what are our alternatives?
		// 1. return a copy of the array list(down side uses memory)
		// 2. use the clone() on array list (down side uses too much memory)
		// 3. use a read-only wrapper class
		// return waitListedStudents; <--bad
		return Collections.unmodifiableList(waitListedStudents);// <--good
	}


	public String toString(){
		return name;
	}


}
