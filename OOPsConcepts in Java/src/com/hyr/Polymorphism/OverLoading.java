package com.hyr.Polymorphism;

public class OverLoading {
	
	void Mul() {
	System.out.println("No parameter Arguments Here");	
	}
	
	void Mul(int a) {
		System.out.println("Singl parameter:- " + a);
	}
	void Mul(int a , String b) {
		System.out.println("Two parameter:- " + a+ b);
	}
	void Mul(String a ,int b ) {
		System.out.println("Two parameter:- " + a+ b);
	}
	void Mul(int a , int b , int c) {
		System.out.println("three parameters  :- " + a + b + c );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading O = new OverLoading();
		O.Mul();
		O.Mul(45);
		O.Mul(143, "Java");
		O.Mul("Core", 111);
		O.Mul(15,10,11);
	}

}
