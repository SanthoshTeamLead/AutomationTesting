package Programs;

public class ReverseEachWord_28 {
	public static void main(String[] args) {
		String Sentence  = "This is Santhosh Talks about You";
		String[] word = Sentence.split(" ");
		for(String takeWord : word) {
			StringBuffer sb = new StringBuffer(takeWord);
			sb.reverse();
			System.out.println(sb +" ");
			System.err.println("*****");
		}
	}
}
