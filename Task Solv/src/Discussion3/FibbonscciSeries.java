package Discussion3;
import java.util.Scanner;

class Fibonacci {
    private int terms;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        terms = sc.nextInt();
    }

    public void printSeries() {
        int a = 0, b = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class FibbonscciSeries {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.input();
        fib.printSeries();
    }
}
