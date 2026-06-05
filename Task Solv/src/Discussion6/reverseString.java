package Discussion6;
import java.util.Scanner;
class ReversePrintString {

    String text;

    void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        text = sc.nextLine();
    }

    void showReverse() {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);
    }
}
public class reverseString {
    public static void main(String[] args) {

        ReversePrintString obj = new ReversePrintString();

        obj.takeInput();
        obj.showReverse();
    }
}
