package com.hyr.programs;

public class HDFC {
	  static float CurrentBal = 10.52f;
	  String Name ;
	  int RollNo;
	public HDFC(String name, int rollNo){
		Name = name ;
		RollNo = rollNo;
	} 
	
	public String toString() {
		return "This Student  Name is "+ Name + " Roll No is " + RollNo ;
	}  
	  
	public static void greatingMessage() {
		System.out.println("Hello WelCome To HDFC");
	}
		
	public void Deposit(int Amount){
		CurrentBal = CurrentBal + Amount;
		System.out.print("Deposit SuccessFully  :- ");
	}
	
	public void WithDraw(float Amount) {
		CurrentBal = CurrentBal - Amount;
		System.out.print("Withdraw SuccessFully  :- ");
	}
	public static float getBal() {
		return CurrentBal ;
	}
		
	public static void main(String[] args) {
		greatingMessage();
		System.out.println(getBal());
		HDFC user = new HDFC("Santhosh", 31);
		user.Deposit(150);
		System.out.println(getBal());
		user.WithDraw(8.25f);
		System.out.println(getBal());
	}
}
