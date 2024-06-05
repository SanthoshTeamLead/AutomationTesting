package com.hyr.Inheritance;

public interface IAdmin extends IDeveloper,IGest{
	public void read(); 
	// In Interface Level We can't Implementation in Method.
	// Class is MultiLevel Interface Support.
	// In class Level in We can Implementation in Method. 
	// In interface Multiple Interface Support and Multilevel Interface Support ?
	// for ex: =  A extends B,c; This is called Multiple & Support Multilevel Also 
	// In Class is Only Support MultiLevel Interface 
	// for ex: =  A extends B  This is Called Multiple 
}
