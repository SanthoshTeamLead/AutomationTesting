package pavan.FAQ;

public class Number_Tenth {
	public static void main(String[] args) {
		int N1 = 0, N2 = 1, sum =0;
		for(int i =2; i < 10; i++) {
			sum = N1 + N2;
			System.out.println(sum);
			N1 =N2;
			N2 = sum;
		}
	}
}
