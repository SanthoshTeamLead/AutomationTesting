package pavan.FAQ;

import java.util.Scanner;

public class Number_SearchingElementArray {
		public static void main(String[] args) {
			Scanner userinput = new Scanner(System.in);
			System.out.print("Enter a Numer:- ");
			int Number = userinput.nextInt();
			int[] ArrayList = {20,10,201,30,40};
			int len = ArrayList.length;
			Boolean flag = false;
			for(int i =0; i < len ; i++) {
				if(Number == ArrayList[i]){
					System.out.println("Element Found:- " + ArrayList[i]);
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("Element Not Found");
			}
		}
			
}

