package pavan.FAQ;

public class ReverseWordinString {
		public static void main(String[] args) {
			String Sentence ="Am a Good Java Programmer";
			String[] word = Sentence.split(" ");
			for(String i : word){
				StringBuffer sb = new StringBuffer(i);
				sb.reverse();
				System.out.println("Reverse Word:- " + sb);
			}
		}
}
