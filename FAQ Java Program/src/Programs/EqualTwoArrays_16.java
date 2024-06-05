package Programs;

import java.util.Arrays;

public class EqualTwoArrays_16 {

	public static void main(String[] args) {
		int[] array1 = {2,4,6,1,5};
		int[] array2 = {2,4,1,6,5};
		int[] array3 = {2,4,6,1,5};
		
		int len = array1.length;
		Boolean isEqual = true;
		for(int i = 0; i < len; i++){
			if(array1[i] != array2[i]) {
				isEqual =false;
				break;
			} 
		}
		if(isEqual) {
			System.out.println("Given Two Arrays Same");
		}
		else {
			System.out.println("Not same ");
		}
		
		System.out.println("******************************************");
		if(Arrays.equals(array1, array3)) {
			System.out.println("SAME");
		}else {
			System.out.println("NOT SAME");
		}
	}

}
