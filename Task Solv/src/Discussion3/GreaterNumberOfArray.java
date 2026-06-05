package Discussion3;
import java.util.Scanner;

class NumberSeries {
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

    void findGreatest() {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Greatest number = " + max);
    }
}
public class GreaterNumberOfArray {
    public static void main(String[] args) {
        NumberSeries obj = new NumberSeries();

        obj.input();
        obj.findGreatest();
    }
}
