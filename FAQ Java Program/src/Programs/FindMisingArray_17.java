package Programs;

public class FindMisingArray_17 {
	 public static void main(String[] args) {
		 int[] array = {1,2,4,5};
		 int sum =0, sum2=0;
		 for(int i =0; i<array.length; i++) {
			 sum += array[i];
		 }
		 for(int i =1; i <=5; i++) {
			 sum2 += i;
		 }
		 int MissingNumber = sum2 -sum;
		 System.out.println("Missing Number:- " + MissingNumber);
	 }
}
