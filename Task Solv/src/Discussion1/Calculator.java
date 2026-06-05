package Discussion1;
import java.util.Scanner;

class SimpleCalculator{
    public Scanner sc= new Scanner(System.in);
    public int a;
    public int b;
    public char c;
    void takeinput(){
        System.out.print("Enter integer a = ");
        this.a = sc.nextInt();
        System.out.print("Enter integer b = ");
        this.b= sc.nextInt();
        System.out.print("Enter Symbol = ");
        this.c = sc.next().charAt(0);
    }
    void operation(){
        this.a = a;
        this.b = b;
        this.c = c;
        if(c == '+') {
            int sum = a+b;
            System.out.println("The Calculation a + b is " + sum);
        }
        else if(c == '-'){
            int sum = a-b;
            System.out.println("The Calculation is a - b "+ sum);
        }
        else if(c == '*'){
            long  ans = a*b;
            System.out.println("The Calculation is a * b " + ans);
        }
        else if(c == '/'){
            double ans = a/b;
            System.out.println("The Calculation is a / b "+ ans);
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        cal.takeinput();
        cal.operation();
    }
}
