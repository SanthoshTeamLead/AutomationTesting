package com.collections.arraylist;
import java.util.ArrayList;
import java.util.Collection;

public class Arraylistmethods$1 {
	public static void main(String[] args) {
		
		Collection ref_A = new ArrayList();
	 //Method_One    add()
		
		ref_A.add("Raju");
		ref_A.add("Java");
		ref_A.add("Developer");
		System.out.println("Before Joing Elements 3 ref_A:- " + ref_A);
		ref_A.add("MCA");  // 1st Method:-   add()
		
		System.out.println("After Joining Elements 4 ref_A:- " + ref_A);
		
		Collection ref_B = new ArrayList();
		
		ref_B.add("SAIPRASAD");
		ref_B.add("QA");
		ref_B.add("ENGINEER");
		System.out.println("Before Joing Elements 3 ref_A:- " + ref_B);
		ref_B.add("MCA");  // 1st Method:-   add()
		
		System.out.println("After Joing Elements 4 ref_A:- " + ref_B);
		
	//Method_Two     addAll()
	 
		ref_A.addAll(ref_B); 
		System.out.println("ref_B Elements added to ref_A :-"+ref_A);
		
	// 3rd Method :- remove()
		ref_A.remove("Java");  // Removing Element 
		
		
		System.out.println("Removing One Element"+ref_A);
		
		ref_A.add("Java");      //Adding Element 
		System.out.println("Removed Elements is adding :- "+ref_A);

		
	// 4th Method :- removeAll()	
		
		ref_A.removeAll(ref_B);
		System.out.println("ref_B Elements is Removed From ref_A:== " +ref_A);
		
		
	// 5th Method :- Clear()	
		ref_A.clear();
		System.out.println("ref_A All Elements is Clear is Empty Now:-- "+ref_A); // 
	
	//6th Method :- retainAll()
		Collection<String> pr = new ArrayList<>();
		pr.add("html");
		pr.add("css");
		pr.add("javascript");
		pr.add("sam");
		
		
		Collection<String> pr1 = new ArrayList<>();
		pr1.add("html");
		pr1.add("css");
		pr1.add("bootstrap");
		pr1.add("sam");
		pr.retainAll(pr1);
		System.out.println(pr);
		
		
		
		
		
		/*
		 * cl1.addAll(cl); // cl values added into cl1. //cl.addAll(cl1); // all cl1+cl
		 * values added after existing cl values.
		 * 
		 * System.out.println("values of cl1 after addAll: " +cl1);
		 * 
		 * System.out.println("Before removing values of cl: " +cl); cl.remove("Hyd");
		 * System.out.println("After removing values of cl: " +cl);
		 * 
		 * cl.removeAll(cl1); // cl values deleted
		 * System.out.println("after removeAll cl values: " +cl);
		 * System.out.println("after removeAll cl1 values: " +cl1);
		 * 
		 * System.out.println("Before clear cl1 values :" +cl1); cl1.clear();
		 * System.out.println("After clear cl1 values:" +cl1);
		 */

	}

}