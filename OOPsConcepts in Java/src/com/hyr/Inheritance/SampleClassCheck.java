package com.hyr.Inheritance;

import com.hyr.AccessModifiers.Student;


public class SampleClassCheck { // While Using Public can Access to Out side class the 
								// Different Package 
	// *Note:- In Different Pacakges Access the data while Importing Package //
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.rollNumber);
		s.PrintRollNumber();

	}

}
