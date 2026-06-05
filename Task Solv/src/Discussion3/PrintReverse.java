package Discussion3;
import java.util.Scanner;

class ReverseSeries {
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

    void reverse() {
        System.out.println("Reversed Series:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


public class PrintReverse {
    public static void main(String[] args) {
        ReverseSeries obj = new ReverseSeries();

        obj.input();
        obj.reverse();
    }
}
