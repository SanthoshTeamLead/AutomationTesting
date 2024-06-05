package pgms;

public class ReverseString {

	public static void main(String[] args) {
		String stm="The Name Raju is Commonly used";
		String name="Prasanna";
		
		String s[]=stm.split(" ");
		System.out.println("number of words: "+s.length);
		
		//Task1
		StringBuilder sb=new StringBuilder(s[1]);
		System.out.println("Reverser of Second word: "+sb.reverse());
		//Task2
		for(int i=0;i<s.length;i++) {
			StringBuilder sb1=new StringBuilder(s[i]);
			System.out.print(sb1.reverse()+" ");
		}
		System.out.println();

		
		//Task3
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	
	}

}
