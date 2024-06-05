package com.hyr.AccessModifiers;

public class Car {
	
	// With in the Package Out Side the Class We can Access Using Public 
	public static void main(String[] args) {
		Student s = new Student(); // We can Access through by action Object Creation 
		System.out.println(s.rollNumber);
		s.PrintRollNumber();
	}

}
