package com.Package.ObjectClass;

public class StudentToString2 {
	String Name,hi;
	public StudentToString2(String string) {
		// TODO Auto-generated constructor stub
		this.Name = string ;
		
	}
	public String String1() {
		return "test";
	}
	public static void main(String[] args) {
		String s = new String("Raju");
		StudentToString2 s2 = new StudentToString2("ajay");
		Integer i = new Integer(10);
		System.out.println(s);
		System.out.println(i);
	//	System.out.println(t1);
		System.out.println(s2);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hi;
	}

}
