package collectionsHandsOn;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("sai");
		ar.add(null);
		ar.add("manoj");
		ar.add(null);
		System.out.println(ar);         //adding, removing, updateion, delete, getAllValues
		System.out.println(ar.size());
		
		
		ar.remove("manoj");
		System.out.println(ar);
		
		ar.add(2, "sandesh");
		System.out.println(ar);
		
		
		ar.set(2, "Santhosh");
		System.out.println(ar);
		
		System.out.println(ar.get(1));
		
		
		Collections.reverse(ar);
		System.out.println(ar);
	}
}
