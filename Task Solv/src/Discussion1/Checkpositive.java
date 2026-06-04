package Discussion1;
import java.util.Scanner;
class CheckOddEven{
    public Scanner sc = new Scanner(System.in);
    public int num;
    void takeuserInput(){
        System.out.print("Enter integer number : ");
        this.num = sc.nextInt();
    }
    void checkEvenOdd(){
        this.num = num;
        if(num % 2 == 0) System.out.printf("The number %d is Even\n",num);
        else System.out.printf("The number %d is Odd\n",num);
    }
}
class CheckPositiveorNot{
    public Scanner sc = new Scanner(System.in);
    public int num;
    void takeuserInput(){
        System.out.print("Enter integer number : ");
        this.num = sc.nextInt();
    }
    void checkNumber(){
        this.num = num;
        if(num >= 0) System.out.printf("The number %d is Positive\n",num);
        else System.out.printf("The number %d is negative\n",num);
    }
}

public class Checkpositive {
    public static void main(String[] args) {
        CheckPositiveorNot number = new CheckPositiveorNot();
        number.takeuserInput();
        number.checkNumber();
        CheckOddEven n = new CheckOddEven();
        n.takeuserInput();
        n.checkEvenOdd();

    }
}
