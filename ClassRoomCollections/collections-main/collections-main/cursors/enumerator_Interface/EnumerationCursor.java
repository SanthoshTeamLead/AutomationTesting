package enumerator_Interface;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		
		
		/*
		 Enumeration: we get Enumeration object by using elements() which present in vector
		  */
		Vector<Object> v=new Vector<Object>();
		for (int i = 0; i < 10; i++) {
			v.add(i);
		}
		
		 Enumeration<Object> e = v.elements();  //
	        System.out.println("Data in enumeration object is: ");
	        
	        while (e.hasMoreElements())   
	        {             
//	            System.out.println("Element: " +e.nextElement()); 
//	            Integer I=(Integer)e.nextElement();//typecasting because it return type is object
//	            if(I%2==0) {
//	            	System.out.println(I);
//	            }
	        	
	            Integer I=(Integer)e.nextElement();//typecasting because it return type is object
	            if(I%2==0) {
	            	System.out.println(I);
	            }
	        	
	        }
	        System.out.println(v);
	        

	}
	
	/*Limitation Of Enumeration:
	 Methods on Enumeration is--1.hasMoreEelements();
								2.nextElement();
	1. Enemuration concept is applicable only for legacy classes and hence it is not a universal Cursor
	2.By using Enumeration we can get only read access and we cannot perform remove Operation
	Note: To Overcome these we use Iterator
	
	 */

}
