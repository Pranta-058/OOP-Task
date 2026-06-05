package Discussion3;

import java.util.Scanner;

class Student {
    double grade;
    boolean completed;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        grade = sc.nextDouble();

        System.out.print("Semester completed? (true/false): ");
        completed = sc.nextBoolean();
    }

    void checkMedal() {
        if (completed) {
            if (grade >= 3.5) {
                System.out.println("Student gets a Medal.");
            } else {
                System.out.println("Student does not get a Medal.");
            }
        } else {
            System.out.println("Student does not get a Medal.");
        }
    }
}

public class medel {
    public static void main(String[] args) {
        Student s = new Student();

        s.input();
        s.checkMedal();
    }
}
