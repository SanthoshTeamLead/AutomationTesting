package com.hyr.Inheritance;

//What is Super Keyword ? 
/*Super is the Keyword is used to access the superclass Members Like attribute, Methods and 
 also the constructors inside the Subclass.  */ 
class Animal {
	String Name = "Puppy";      //Attribute'S
	
	void callingDog() { 		//Method'S
		System.out.println("outside dog:    " + Name);
	}
	Animal(){					//Constructor'S 
		
	}
	
}
class dog extends Animal{
	String Name = "Snoopy";
	
	void callingDog() {
		super.callingDog();
		System.out.println("With in Scope Dog:  " + Name);
	}
	
	public static void main(String[] args) {
	
	dog d = new dog();
	d.callingDog(); // Super is the Keyword is used to access the  
	
	Animal a = new Animal();
	a.callingDog(); // Individual Object Create And Calling....
		
}	
	
}





























/*
 * public class SuperKeyword extends Developer {
 * 
 * // Using Super keyword Refers to the immediate parent Class.
 * 
 * public void Samplesuper() { read();//Using super keyword Refers to the
 * immediate parent Class. //Without Using super keyword to access the with in
 * the Scope Method Data. System.out.println("Java is Most Popular Language");
 * 
 * } public void read(){
 * System.out.println("With in Scope Read Access in java"); } SuperKeyword sp =
 * new SuperKeyword(); sp.Samplesuper();
 * 
 * }
 */
	


