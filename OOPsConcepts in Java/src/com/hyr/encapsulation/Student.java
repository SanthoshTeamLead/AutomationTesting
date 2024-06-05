package com.hyr.encapsulation;

public class Student {
	private int rollNumber; 
 //	private String Name;
 //	private boolean isAttended;

	public Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}
														
	// *rollNumber*
	public int getRollNumber() {
		System.out.println("rollNumber Accessed to the Teacher ");
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
		System.out.println("Teached assgined to RollNumber");
	}

	/**
	// *Name*
	public String getName() {
		System.out.println("Name is accessed to the Teacher Founded");
		return Name;
	}
	public void setName(String name) {
		System.out.println("Teacher is assigned  to the Name");
		Name = name;
	}
	
	// isAttendence
	public void setStudentAttendence(boolean flag) {
		if(!isAttended)
		isAttended = flag;
		System.out.println("Teacher assigned to attendence Techer");
	}
	public boolean getStudentAttendence() {
		System.out.println("Teacher Accessed to the Student Attendence");
		return isAttended;
		
	}
	*/
	
}
