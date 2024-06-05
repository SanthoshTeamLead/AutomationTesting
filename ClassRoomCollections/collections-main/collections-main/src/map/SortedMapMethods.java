package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethods {

	public static void main(String[] args) {

		SortedMap<Integer,String> sm=new TreeMap<Integer,String>();
		
		sm.put(101, "prasanna");
		sm.put(107, "kumar");
		sm.put(102, "pramod");
		sm.put(154, "murali");
		sm.put(100, "sai");
		sm.put(111, "kiran");
		sm.put(90, "krishna");
		sm.put(70, "aaaa");
		
		//public void firsrKey()
		System.out.println(sm.firstKey());
		
		//public void lastKey()
		System.out.println(sm.lastKey());
		
		//public void keySet()
		System.out.println(sm.keySet());
		
		//public sortedmap headMap(100)
		System.out.println(sm.headMap(100));//<
		
		//public soretdmap tailMap()
		System.out.println(sm.tailMap(100));//>=
		
		System.out.println(sm.subMap(100, 154));//>=,<
		//public set entrySet()
		System.out.println(sm.entrySet());
		//public collection values()
		System.out.println(sm.values());
		//public int comparator()
		System.out.println(sm.comparator());
		
		
	
			
	}

}
