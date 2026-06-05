package Discussion3;
import java.util.Scanner;

class PrimeNumber {
    int num;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

    void checkPrime() {
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
public class CheckNumerisPrimeOrNOt {
    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();

        obj.input();
        obj.checkPrime();
    }
}
