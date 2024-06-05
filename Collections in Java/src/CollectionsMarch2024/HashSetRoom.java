package CollectionsMarch2024;

import java.util.HashSet;

public class HashSetRoom {
	public static void main(String[] args){
		/**  HashSet Rules :- 
		 * In HashSet Duplicates are Not allowed and Inseration Order Not Preserved
		 * Null value is Possible and Hetrojenous Obj are allowed
		 * Hashset is unorder Collection Elements  it's allowed Only Unique Values 
		 * HasSet Some mehods here:- add() , remove() , size(), Contains(), 
		 * 		 
		 * */
		HashSet<String> hset1 = new HashSet<>();
		hset1.add("Raju");
		hset1.add("Ravi");
		hset1.add("Raghu");
		
		System.out.println(hset1);
		
		HashSet<String> hset2 = new HashSet<>();
		hset2.add("Mango");
		hset2.add("banana");
		hset2.add("Ravi");
		System.out.println(hset2);
		
		// addAll() Union "u" Both Unique Elements Store in hset1
	//	hset1.addAll(hset2);
	//	System.out.println(hset1);
		
		//RetainAll() intersetion "n"
	//	hset1.retainAll(hset2);
	//	System.out.println(hset1);
		
		//RemoveAll()
		hset1.removeAll(hset2);
		System.out.println(hset1);
		
		
	}
}
