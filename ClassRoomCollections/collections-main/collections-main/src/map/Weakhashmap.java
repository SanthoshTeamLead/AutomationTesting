package map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Weakhashmap {

	public static void main(String[] args) throws InterruptedException {
		HashMap hs=new HashMap();
		Temprory t=new Temprory();
		hs.put(t,"passed");
		System.out.println(hs);
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(hs);
		
		WeakHashMap wm=new WeakHashMap();
		Temprory t1=new Temprory();
		wm.put(t1,"passed");
		System.out.println(wm);
		t1=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(wm);
		
	}

}

class Temprory{
	public String toString() {
		return "test";
	}
	public void finalize() {
		System.out.println("Finalized Method called");
	}
}