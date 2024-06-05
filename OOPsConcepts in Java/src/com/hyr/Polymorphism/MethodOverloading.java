package com.hyr.Polymorphism;

public class MethodOverloading {
	static int A; 					// Different Type Of parametrs {Order, DatatypeSeq, No'of Arguments}

	//No parameter Arguments (OR)
	public void jdd() {
		System.out.println("No Parameter Argument");
	}
	
	// Single Parameters Arguments  (OR)
	public int Add(int a) {
		int A = a;
		System.out.println("Single Parameter Argument:- " + A);
		return A;
	}
	// Double Parameters Arguments (OR)
	public int Add(int a, int b) {
		int A = a + b;
		System.out.println(A);
		return A;

	}

	// Order Of Parameter Different
	public int Name(String a, int b, int c) {

		int A = b + c;
		System.out.println(A);
		System.out.println(a);
		
		return A;

	}

	public static void main(String[] args) {
		MethodOverloading add = new MethodOverloading();
		add.Add(15);
		add.jdd();
		//String SAI = null;
		//add.Name("SAI", 1, 2);
		//add.Name(null, A, A);

	}

}
