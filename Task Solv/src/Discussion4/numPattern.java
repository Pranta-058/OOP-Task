package Discussion4;
import java.util.Scanner;

class Pattern {
    private int n;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
    }

    public void printPattern() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class numPattern {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.input();
        p.printPattern();
    }
}
