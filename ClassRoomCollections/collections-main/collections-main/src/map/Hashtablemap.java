package map;

import java.util.Hashtable;

public class Hashtablemap {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();//11
		ht.put(new Temp(5),"aa");
		ht.put(new Temp(20),"cc");
		ht.put(new Temp(14),"ee");
		ht.put(new Temp(50),"bb");
		ht.put(new Temp(90),"ff");
		ht.put(new Temp(0),"zz");
		System.out.println(ht);
	}

}
class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+" ";
		
	}
}
