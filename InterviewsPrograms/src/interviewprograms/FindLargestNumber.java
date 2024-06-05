package interviewprograms;

public class FindLargestNumber {
	 public static void main(String[] args) {
		 int a =12, b =10, c =55;
		 
		 if(a > b && a > c) {
			 System.out.println("a is Largest");
		 }
		 else if(b > a && b > c){
			 System.out.println("b is Largest");
		 }else if( c > a && c > b){
			 System.out.println("c is Largest");
		 }
	 }
}
