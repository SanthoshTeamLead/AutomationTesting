package com.hyr.Interface;

public interface SmartPhone {
	public void  Camera100MP();
	public void  Android_OS_13();
	public void  IP68();
	public void  SIM5G();
	default void Security3Years() {
		System.out.println("Please Implements Security3Years Code");
	}
	static void OsUpdate2years() {
		System.out.println("Please Implements OsUpdate2years");
	}
	 
}
