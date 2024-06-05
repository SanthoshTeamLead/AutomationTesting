package CollectionsMarch2024;

import java.util.HashMap;
import java.util.ArrayList;

public class HashMapRoom {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<>();
		//Adding The Element
		hmap.put("Java", 101);
		hmap.put("C++",  102);
		hmap.put("ReactJs", 103);
		hmap.put("Anguler", 104);
		hmap.put("Devops", 105);
		
		System.out.println(hmap);
		
		//Accesing The Element 
		Integer Value = hmap.get("Devops");
		System.out.println(Value);
		
		HashMap<Integer, String> hmapOne = new HashMap<>();
		// Adding the Element
		hmapOne.put(101, "Bharath");
		hmapOne.put(102, "Santhosh");
		hmapOne.put(103, "SaiKrishana");
		hmapOne.put(104, "Nagaraju");
		hmapOne.put(105, "Ramana");
		
		System.out.println(hmapOne);
		//Accesing The Element
		String Value1 = hmapOne.get(103);
		System.out.println(Value1);
		
		//Replace The Value 
		// hmapOne.put(105, "Sanjeev");
		hmapOne.replace(105, "Sanjeev");
		System.out.println(hmapOne);
		
		
		/*Only  Keys */
		
		ArrayList<Integer> OnlyKeys = new ArrayList<>(hmapOne.keySet());
		System.out.println(OnlyKeys);
		
		/*Only Values */
		
		ArrayList<String> onlyValues = new ArrayList<>(hmapOne.values());
		System.out.println(onlyValues);
		
		
		/*Entiry Set */
		
		System.out.println(hmapOne.entrySet());
		
		int Smallest = Math.min(64, 45);
		System.out.println(Smallest);
		
		int Biggest = Math.max(99, 10);
		System.out.println(Biggest);
		
		double Power = Math.pow(2, 3);
		System.out.println(Power);
		
		Double Abous = Math.abs(1.8);
		System.out.println(Abous);
		
		double Rounds = Math.round(4.5);
		System.out.println(Rounds);
		
		
		
		
		
		
		
		
	}

}
