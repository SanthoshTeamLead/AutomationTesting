package com.hyr.programs;

public class constractorPrac {
	int i ;
	int j ;
	int k ;
	
	public constractorPrac() {
		i = 15;
		j = 26 ;
	}
	public constractorPrac(int a , int b) {
		this.i = a;
		this.j = b;
	}
	public constractorPrac(int a, int b, int c) {
		this.i = a;
		this.j = b;
		this.k = c;
	}
	
	
	public static void main(String[] args) {
		constractorPrac  t1 = new constractorPrac();
		constractorPrac  t2 = new constractorPrac(35 , 45);
		constractorPrac  t3 = new constractorPrac(12,15,52);
		
		System.out.println("Constractor Default Vales assigned : "+t1.add());	//Constractor Default Values is Zeros 
		System.out.println("Using Parameter:" + t2.add());
		System.out.println("Using three Parameter: " + t3.adds());
	}
	public int add() {
		return i + j ;
	}
	public int adds() {
		return i + j+ k;
	}
}
