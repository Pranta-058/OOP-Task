package Discussion1;

import java.util.Scanner;
class VolumeofBall{
    public Scanner sc = new Scanner(System.in);
    public double radious;
    public double pi = Math.PI;
    void uesrinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radious : ");
        this.radious = sc.nextDouble();
    }
    void volume(){
        this.radious = radious;
        this.pi = pi;
        double vol = (4/3) * pi * radious *radious *radious;
        System.out.println("The Volume od a Ball is = " + vol);
    }
    void userinputcircle(){
        System.out.print("Enter Radious : ");
        this.radious = sc.nextDouble();
    }
    void areaofCircle(){
        this.radious = radious;
        this.pi = pi;
        double area = pi * radious * radious;
        System.out.println("The Area of Circle is = " + area);
    }
}

class TriangleArea{
    public double base;
    public double height;
    void userinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        this.base = sc.nextDouble();
        System.out.print("Enter Height : ");
        this.height = sc.nextDouble();
    }

    void triangleArea(){
        this.base = base;
        this.height = height;
        double area = 0.5 * base * height;
        System.out.println("The Area of Triangle = " + area);
    }
}
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleArea TA = new TriangleArea();
        TA.userinput();
        TA.triangleArea();
        VolumeofBall ball = new VolumeofBall();
        ball.uesrinput();
        ball.volume();
        ball.userinputcircle();
        ball.areaofCircle();
    }
}
