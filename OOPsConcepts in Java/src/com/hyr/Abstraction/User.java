package com.hyr.Abstraction;

public class User {

	public static void main(String[] args) {
		//Here User can access Implementation Functionality by through Lenovo class
		// calling copy() method direct View implementation By the User. 
	//	Lenovo lenovo = new Lenovo();
	//	lenovo.Copy(); // (F+ f3) Redirected to Implementation Class
	//	lenovo.Cut();
	//	lenovo.Capture();
	
		// Here Abstraction Concepts are Implementation Hiding. Only User can 
		// Can Access Functionality. So Here lenovo implements the Laptop Declare  
		//Methods if you declare interface Name LeftSide.
	
	//	Laptop hp = new Hp();
	//	hp.Copy();  //(F+ f3) Redirected to Only Functionality interface
	//	hp.Cut();
	//	hp.Keyboard();
	//=====================================
		//Parent p = new Child();
					LaptopOne acr = new Acer();
					
					acr.print();
					acr.xerox();
					acr.copy();
			//		acr.keyword();
	 /*Parent Reference can bee used to hold child objects but that parent Reference
	   variable you can call Only Parent Class Methods And U can't call Child 
	   Objects Methods(RunTime Object)*/
	// in the above example Acer()class  can Overriden the Parent Copy Method 
	// In The above Copy Acer Method Printed. Override Concepts Applicable Here. 
	}
}
