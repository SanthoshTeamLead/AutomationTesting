package MCQNEXTWAVE.mcq;

import java.util.Arrays;
import java.util.HashMap;

public class Two {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<>();
		hmap.put(101, "SANTHOSH");
		hmap.put(102, "RAJU");
		hmap.put(103, "NAGARAJU");
		hmap.put(105, "S JEEVAN");
		
		System.out.println(hmap);
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		
		HashMap<Integer, String> hmap1 =  new HashMap<>();
		hmap1.put(111, "Ram");
		hmap1.put(222, "Sam");
		hmap1.put(333, "Mahi");
		hmap1.remove(111);
		System.out.println(hmap1.containsValue("Ram"));
		
		hmap.putAll(hmap1);
		System.out.println(hmap);
		
		String name = "Rajesh";
		String Forset = String.format("%S", name);
		System.out.println(Forset);
		
		
	}
}
 // it showing Error Because Once Declare Final Varible Can't Change The Value 