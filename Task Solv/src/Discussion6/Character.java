package Discussion6;
import java.util.Scanner;

class CharacterCount {

    String text;
    char ch;

    void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        text = sc.nextLine();

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
    }

    void countCharacter() {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Occurrence of '" + ch + "' = " + count);
    }
}
public class Character {
    public static void main(String[] args) {

        CharacterCount obj = new CharacterCount();

        obj.takeInput();
        obj.countCharacter();
    }

}
