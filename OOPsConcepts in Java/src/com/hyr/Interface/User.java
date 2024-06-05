package com.hyr.Interface;

public class User {

	public static void main(String[] args) {
		System.out.println("In Below Only For Realme Objects :-");
	    Realme realme = new Realme();
	    realme.Camera100MP();
	    realme.Android_OS_13();
	    realme.IP68();
	    realme.SIM5G();
	    
	    realme.Gesture();
	    realme.Fingerprint(); 
	    //You can use 'default'In Interface  :- 
	    /* We can't Access Directly Out Side World Only By through 
	     the Whoever Implement the class. Use Class Name through Calling
	      Bellow Here Ex:- 
	    */
	    realme.Security3Years();
	   
	    //You can use 'static' In Interface:- 
	    /*We Can Access Driectly Rest of the World by through ClassName 
	      in the same Bellow Here Ex:-        */
	    SmartPhone.OsUpdate2years();
	    System.out.println();
	    
	    System.out.println("In Below Only For Oppo Objects :-");
	    Oppo oppo = new Oppo(); 
	    oppo.Gesture();
	    oppo.Fingerprint();
	    
	    
	    System.out.println();
	    
	    System.out.println("In Below Only For Samsung Objects :-");
	    Samsung samsung = new Samsung(); 
	    samsung.Camera100MP();
	    samsung.IP68();
	    samsung.Android_OS_13();
	    samsung.SIM5G();
	    
	    
	}
}
