package Discussion1;
import java.util.Scanner;
class Grade{
    public Scanner sc = new Scanner(System.in);
    public double grade;
    void takeInput(){
        System.out.print("Enter mark : ");
        this.grade = sc.nextDouble();
    }
    void result(){
        this.grade = grade;
        if(grade >= 90.0) System.out.print("Grade A+");
        else if(90.0 > grade && grade >= 80.0) System.out.print("Grade A");
        else if(80.0 > grade && grade >= 70.0) System.out.print("Grade A-");
        else if(70.0 > grade && grade >= 60.0) System.out.print("Grade B");
        else if(60.0 > grade && grade >= 40.0) System.out.print("Grade C+");
        else System.out.print("Fail");

    }
}

public class calculateGrade {
    public static void main(String[] args) {
        Grade mark = new Grade();
        mark.takeInput();
        mark.result();
    }
}
