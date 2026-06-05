package Discussion3;
import java.util.Scanner;

class Employee {
    double sales;
    double attendance;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales percentage: ");
        sales = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        attendance = sc.nextDouble();
    }

    void calculateBonus() {
        if (sales >= 95) {
            if (attendance == 100) {
                System.out.println("Bonus = 60%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 40%");
            } else {
                System.out.println("Bonus = 5%");
            }
        } else if (sales >= 80) {
            if (attendance == 100) {
                System.out.println("Bonus = 40%");
            } else if (attendance >= 90) {
                System.out.println("Bonus = 20%");
            } else {
                System.out.println("Bonus = 5%");
            }
        } else {
            System.out.println("Bonus = 5%");
        }
    }
}


public class Bonous {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.input();
        emp.calculateBonus();
    }
}
