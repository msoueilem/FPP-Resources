import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        String word;
        String reversedWord = "";
        System.out.print("Enter the word that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        for (int i=word.length()-1; 0 <= i ;i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.print("This is your word (" + word + ") now after has been reversed (" + reversedWord+")");
    }
}
