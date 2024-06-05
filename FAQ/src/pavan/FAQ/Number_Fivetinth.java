package pavan.FAQ;

public class Number_Fivetinth {
		public static void main(String[] args) {
			int[]  arraylist = {2,5,6,1,8,9,4};
			String EvenNum = "";
			String OddNum =" ";
			for(int i = 0; i < arraylist.length ; i++) {
				if(arraylist[i]%2 == 0) {
					EvenNum += arraylist[i];
				}else if(arraylist[i]%2 == 1) {
					OddNum += arraylist[i];
				}
			}
			System.out.println("Even Numbers:- " + EvenNum);
			System.out.println("Odd Numbers:- " + OddNum);
		}
}
