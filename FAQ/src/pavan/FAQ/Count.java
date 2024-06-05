import java.util.Scanner;

class Countstring{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a Word:- ");
        String word = user.nextLine();
        int len = word.length();
        System.out.println("Count Of Given String:-  " + len);

    }
}