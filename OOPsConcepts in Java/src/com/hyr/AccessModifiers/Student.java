package com.hyr.AccessModifiers;

public class Student {   
						//****STEP--01****//
	public int rollNumber = 150 ;
	int age = 25 ;// Declare a Variable 
	
	public Student() {		            // When I Use *Public* Keyword Access to  Constractor 
		rollNumber = 1512 ;
	}
	
	
	public void PrintRollNumber() {     // When I Use *Public*  Keyword Access to  Method 
		System.out.println(rollNumber);
	}
	
	
	private void SampleprivateMethod() {  // public access to Private and private access to Public 
		
		PrintRollNumber();      // Access with in class Diffrent Methods 
		System.out.println(rollNumber);
	}
	
	
	
	

}
