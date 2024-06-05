package pavan.FAQ;

import java.util.Scanner;

public class SearchingElement_ArrayList {
	public static void main(String[] args) {
		Scanner userinput =new Scanner(System.in);
		System.out.println("Enter a Number :- ");
		int Number = userinput.nextInt();
		int[] arrayList = {45,1,25,3,65,77,9};
		int len = arrayList.length;
		Boolean flag = false;
		for(int i = 0; i < len ; i++) {
			if(Number == arrayList[i]){
				System.out.println("Number Found");
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Number Not Found");
		}
	}
}
