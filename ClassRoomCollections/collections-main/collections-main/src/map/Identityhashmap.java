package map;

import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identityhashmap {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		String s=new String("name");
		String s1=new String("name");
		
		hm.put(s, "sai");
		hm.put(s1, "sai krishna");
		System.out.println(hm);//In jvm internal calls equals() to search for duplicate keys exist or not[i.equal(i1)]
		
		//if u want search by Adress use Identity Has map
		IdentityHashMap im=new IdentityHashMap();
		im.put(s, "sai");
		im.put(s1, "sai krishna");
		System.out.println(im);

	}

}
