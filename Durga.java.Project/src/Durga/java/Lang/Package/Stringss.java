package Durga.java.Lang.Package;

public class Stringss {

	public static void main(String[] args) {
		String s = new String("Raju");
		s.concat("Java Developer");
		System.out.println(s);
		// o/p Raju  //immutable it's can't change the Object New object Will be Created
		
		StringBuffer sb = new StringBuffer("Java Developer");
		sb.append("Santhosh");
		System.out.println(sb); //mutable it's Change the Object 
		// o/p:- Java DeveloperSanthosh
	}
	

}
