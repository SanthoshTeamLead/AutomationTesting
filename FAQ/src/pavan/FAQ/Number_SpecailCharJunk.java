package pavan.FAQ;

public class Number_SpecailCharJunk {
	public static void main(String[] args){
		String Word = "qwdas !@#$% %^&&**(*&^%$##$%^&**&^%$#@#$da sdff2";
		String RemoveJunk = Word.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(RemoveJunk);
	}
}
