package pavan.FAQ;

import java.util.Arrays;

public class Sixtenth {
	public static void main(String[] args){
		int[] ArrayOne = {2,4,5,6,9};
		int[] ArrayTwo = {2,4,5,6,9};
		int[] ArrayThree = {2,6,5,4,9};
		
		int len = ArrayOne.length;
		Boolean isEqual = true;
		
		for(int i =0; i <len ; i++) {
			if(ArrayOne[i] != ArrayTwo[i]){
				isEqual = false;
				break;
			}
		}	
		if(isEqual) {
			System.out.println("Both Arrays are same");
		}else {
			System.out.println("Both Arrays Are Not same");
		}
		
		if(Arrays.equals(ArrayOne, ArrayThree)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are Not same");
		}
		
		
	}
}
