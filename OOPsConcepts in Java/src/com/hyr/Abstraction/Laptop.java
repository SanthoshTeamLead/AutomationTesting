package com.hyr.Abstraction;

public interface Laptop { //1.2
	public void Copy();
	public void Cut();
	public void Paste();
	public void Keyboard();
	 
	default void Capture() {
		System.out.println("This is Your Optional");
	}
}
