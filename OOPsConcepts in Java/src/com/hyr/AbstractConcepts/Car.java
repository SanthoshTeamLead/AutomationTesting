package com.hyr.AbstractConcepts;

public interface Car {
	public void Engine();
	public void Radiator();
	public void Transmition();
	public void AlexaMusic();
	public default void Brakers() {
		 System.out.println("default method from Car(I)");
	 }
}
