package Discussion6;
import java.util.Scanner;

class PalindromeCheck {

    String word;

    void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        word = sc.nextLine();
    }

    void checkPalindrome() {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {

        PalindromeCheck obj = new PalindromeCheck();

        obj.takeInput();
        obj.checkPalindrome();
    }
}
