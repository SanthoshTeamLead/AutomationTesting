package Programs;

public class EvenOddInArray_15 {
	public static void main(String[] args) {
		int[] array = {2,5,8,10,16,4,1,99,6,11,9};
		int EvenNum =0 , OddNum = 0, len = array.length;
		for(int i = 0; i<len; i++) {
			int N = array[i];
			if(N%2 == 0) {
				EvenNum++;
			}else if(N%2 == 1) {
				OddNum++;
			}
		}
		System.out.println("Even Num In Array:- " + EvenNum);
		System.out.println("Odd Num In Array:- " + OddNum);
	}
}
