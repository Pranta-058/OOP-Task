package Discussion2;

import java.util.Scanner;
class LeapYear{
    public long year;
    public Scanner sc = new Scanner(System.in);
    void takeinput() {
        System.out.print("Enter Year ");
        this.year = sc.nextInt();
    }
    void CheakLeapyear(){
        this.year = year;
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println("This Year is LeapYear");
        else System.out.println("This Year is not leap year");
    }
}

public class lipyear {
    public static void main(String[] args){
        LeapYear time = new LeapYear();
        time.takeinput();
        time.CheakLeapyear();
    }
}
