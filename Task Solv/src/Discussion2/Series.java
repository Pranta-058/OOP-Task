package Discussion2;

import java.util.Scanner;


class Evenseries{
    public Scanner sc = new Scanner(System.in);
    public int num;
    void takeInput(){
        System.out.print("Enter value : ");
        this.num = sc.nextInt();
    }
    void evenNumber(){
        this.num = num;
        System.out.println("Print Even Series : ");
        for(int i = 2; i <= num; i+= 2){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
    void oddNumber(){
        this.num = num;
        System.out.println("Print Odd Series : ");
        for(int i = 1; i <= num; i += 2){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    void evenSum(){
        this.num = num;
        System.out.print("Print Even Sum = ");
        int sum = 0;
        for(int i = 2; i <= num ; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
    void oddSum(){
        this.num = num;
        System.out.print("Print Odd Sum = ");
        int sum = 0;
        for(int i = 1; i <= num ; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }


}
public class Series {
    public static void main(String[] args) {
        Evenseries value = new Evenseries();
        value.takeInput();
        value.evenNumber();
        value.oddNumber();
        value.evenSum();
        value.oddSum();
    }
}

