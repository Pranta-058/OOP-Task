package Discussion3;
import java.util.Scanner;

class NumberCounter {
    int n;
    int[] arr;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void countOddEven() {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers = " + evenCount);
        System.out.println("Odd Numbers = " + oddCount);
    }
}

public class PrintOddEvenValue {
    public static void main(String[] args) {
        NumberCounter obj = new NumberCounter();

        obj.input();
        obj.countOddEven();
    }
}
