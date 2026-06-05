package Discussion3;

import java.util.Scanner;

class Array {
    Scanner sc = new Scanner(System.in);
    int n;
    double[] arr;

    void takeinput() {
        System.out.print("Enter size of array : ");
        n = sc.nextInt();

        arr = new double[n];

        System.out.print("Enter value of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
    }

    void Average() {
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = sum / n;
        System.out.println("The Average value is = " + avg);
    }
}

public class Storevalue {
    public static void main(String[] args) {
        Array ar = new Array();
        ar.takeinput();
        ar.Average();
    }
}