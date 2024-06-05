package com.hyr.Polymorphism;

public class ClientTesting {

	public static void main(String[] args) {
		// working with Activa implementation
		Bike bike = new Activa5gImpl();
		bike.engine(); //Here engine method is called from Activa5gImpl class Why
						// Bcoz The Runtime Object Is Activa5gImpl class.
		bike.tyre(); // So The Method(engine) is excuted from child class 
		
		
	}

}
