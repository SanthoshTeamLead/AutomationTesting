package Durga.java.Lang.Package;

public class typeConversion {
	static int  a = 12;
	static float b = a; //This Called Implicitly TypeConverion 
	
	static long c = 1525L;
	public static void main(String[] args) {
	System.out.println(a);
	System.out.println(b);
	System.out.println((float)c); //This TypeConversion is Called Explicitly   
	}

}
