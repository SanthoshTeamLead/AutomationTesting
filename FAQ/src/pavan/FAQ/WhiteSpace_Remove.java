package pavan.FAQ;

public class WhiteSpace_Remove {
	public static void main(String[] args) {
		String word = "Ramesh is A Good boy";
		System.out.println("Before Remove WhiteSpace:- " + word);
		String words= word.replaceAll("\\s", "");
		System.out.println("After Remove WhiteSpace:- " + words);
	}
}
