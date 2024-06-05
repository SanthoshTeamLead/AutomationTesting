package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigablemapMethods {

	public static void main(String[] args) {
		NavigableMap<Integer,String> nm=new TreeMap<Integer,String>();
		nm.put(101, "prasanna");
		nm.put(107, "kumar");
		nm.put(102, "pramod");
		nm.put(154, "murali");
		nm.put(100, "sai");
		nm.put(111, "kiran");
		nm.put(90, "krishna");
		nm.put(70, "aaaa");
		
		System.out.println(nm);
		/*--------------------- Keys-------------------*/
		
		//public key floor(): it return same value if exist 
		System.out.println(nm.floorKey(102));//102
		
		//public key lowerKey():it return last element before 
		System.out.println(nm.lowerKey(102));//101
		
		// public key ceilingKey() 
		System.out.println(nm.ceilingKey(100));
		
		//public key higherKey()
		System.out.println(nm.higherKey(100));
		
		//public key descendingKeySet()
		System.out.println(nm.descendingKeySet());
		
		//public object firstKey()
		System.out.println(nm.firstKey());
		
		
		/*------------------Entry---------------------*/

		System.out.println(nm.lowerEntry(100));
				
		System.out.println(nm.floorEntry(120));
		
		System.out.println(nm.ceilingEntry(100));
		
		System.out.println(nm.higherEntry(120));
		
		//public Entry firstEntry() 
		System.out.println(nm.firstEntry());
		
		System.out.println(nm.lastEntry());
		
		//public entry headMap()
		System.out.println(nm.headMap(100));//<100
		
		System.out.println("true stmt :"+nm.headMap(100, true));
		System.out.println("false stmt:"+nm.headMap(100, false));
		
		//public entry tailMap() 
		System.out.println(nm.tailMap(100));//=>	
		System.out.println("true tail: "+nm.tailMap(100, true));	
		System.out.println("false tail: "+nm.tailMap(100, false));
		
		//public Entry descendingMap()
		System.out.println(nm.descendingMap());

		//public key navigableKeySet()
		System.out.println(nm.navigableKeySet());//[70, 90, 100, 101, 102, 107, 111, 154]
		
		//public pollFirstEntry()
		System.out.println("pollFirstEntry() :"+nm.pollFirstEntry());
		
		//public pollLastEntry()
		System.out.println("pollLastEntry() :"+nm.pollLastEntry());
		
		
		
		
	}

}
