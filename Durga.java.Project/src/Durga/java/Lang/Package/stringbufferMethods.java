package Durga.java.Lang.Package;

public class stringbufferMethods {

	public static void main(String[] args) {
	//	case 1: - Default Capacity 16
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmonp");
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity());
		System.out.println("************************************************");
	// case 2 :- // (CurrentCapacity + 1)*2
		StringBuffer sb1 = new StringBuffer(19); // intially YOu Mention Capacity 
		System.out.println(sb1.capacity());
		sb1.append("abcdefghijklmonpqraaaaa");  
		System.out.println(sb1.capacity());
		System.out.println("************************************************");	
		
		//setCharAt() 
		StringBuffer sba = new StringBuffer("SAnthosh");
		sba.setCharAt(3, 'H');
		System.out.println(sba);
		System.out.println("************************************************");	
		//reverse()
		StringBuffer rev = new StringBuffer("MadaMa");
		rev.reverse();
		System.out.println(rev);
		System.out.println("************************************************");	
		//setLength()
		StringBuffer set = new StringBuffer("SANTHOSH GORANTALA");
		set.setLength(8);
		System.out.println(set);
		System.out.println("************************************************");	
		//ensureCapacity()
		StringBuffer incre = new StringBuffer();
		System.out.println(incre.capacity());
		incre.ensureCapacity(1000);
		System.out.println(incre.capacity());
		System.out.println(" \"ensureCapacity()\"  ************************************************");	
		//trimToSize() 
		StringBuffer tri = new StringBuffer(1000);
		System.out.println(tri.capacity());
		tri.append("santhu");
		tri.trimToSize();
		System.out.println(tri.capacity());
	}

}
