package pgms;

public class NumberRevirse {

	public static void main(String[] args) {
		int number=250;
		int reverseNum=0;
		
		while(number!=0) {
		int  digit=number%10;
		reverseNum=reverseNum*10+digit;
		number/=10;
		}
		System.out.println(reverseNum);

	}

}
