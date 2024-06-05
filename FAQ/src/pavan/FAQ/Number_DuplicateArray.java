package pavan.FAQ;

public class Number_DuplicateArray{
	public static void main(String[] args) {
		String[] array = {"java", "c","c++","Oracle","Devops","java"};
		int len = array.length;
		Boolean flag = false;
		for(int i = 0; i <len; i++) {
			for(int j = i+1; j<len ;j++) {
				if(array[i] == array[j]){
					System.out.println("Duplicate Element is :- " + array[i]);
					flag = true;
				}
			}
		}
		if(flag == false) {
			System.out.println("Duplicate Element is Not Found");
		}
	}
}