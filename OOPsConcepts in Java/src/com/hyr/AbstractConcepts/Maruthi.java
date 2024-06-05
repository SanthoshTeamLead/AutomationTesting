package com.hyr.AbstractConcepts;
 

public abstract  class Maruthi implements Car {
	
	
	public void Engine() {
		System.out.println("Every Model Car use Same Engine Performance Information Code");
	}
	public void Radiator() { 
		System.out.println("Every Model Car use Same Radiator Performance Information Code ");
	}
	public void Transmition() {
		System.out.println("Every Model Car use Same Transmition Performance Information Code"); 
		}
	public abstract void AlexaMusic(); 
	public abstract void Brakers();

}
