package Durga.java.Lang.Package;

public class HashCodeOverride_2 {
    int i ; 
    HashCodeOverride_2(int i){
    	this.i = i;
    }
	public int hashCode() {
		return i ;
	}
	 
	public static void main(String[] args) {
		HashCodeOverride_2 hash = new HashCodeOverride_2(10);
		HashCodeOverride_2 hash1 = new HashCodeOverride_2(100);
		System.out.println(hash);
		System.out.println(hash1);
	}

}
