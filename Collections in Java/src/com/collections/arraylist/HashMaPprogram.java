package com.collections.arraylist;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class HashMaPprogram {
	
	public static void main(String[] args) {
	//1.Create a HashMap List 
	Set<Integer> a = new HashSet<>();
	HashMap<Integer, String> hmap = new HashMap<>();
	//2. adding Elements in HashMap based Key value pair 
	hmap.put(101, "Raju");
	hmap.put(102, "Santhosh");
	hmap.put(103, "vijay");
	hmap.put(104, "ChandraShekar");
	System.out.println(hmap);
	
	//3. Accesing the Values 
	String val= hmap.get(101);
		
	}

}
