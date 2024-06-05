package com.hyr.Inheritance;

import com.hyr.AccessModifiers.Student;

public class Subclass extends Student{
    //Then Using *Public* Keyword Access the data in Subclass while Import the Package Name 	 
	public void test() {
		System.out.println(rollNumber);
		PrintRollNumber();
	}
	
	public static void main(String[] args) {
		Subclass a =new Subclass();
		a.test();
	//	new Subclass().test(); Using new instance Create Objects 

	}
	
	
	
	
	

}
