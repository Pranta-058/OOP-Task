package Discussion1;
import java.util.Scanner;

class AreaofTriangle{
    public Scanner sc = new Scanner(System.in);
    public double arm1,arm2,arm3;
    void takeUserInput(){
        System.out.print("Enter arm1 : ");
        this.arm1 = sc.nextDouble();
        System.out.print("Enter arm2 : ");
        this.arm2 = sc.nextDouble();
        System.out.print("Enter arm3 : ");
        this.arm3 = sc.nextDouble();
    }
    void areaOfTriangle(){
        this.arm1 = arm1;
        this.arm2 = arm2;
        this.arm3 = arm3;
        double s = (arm1+arm2+arm3)/2.0;
        double ans = s*(s-arm1)*(s-arm2)*(s-arm3);
        double area = Math.sqrt(ans);
        System.out.println("The Area of Triangle = "+ area);

    }
}

class EquilateralTri{
    public double arm;
    public Scanner sc = new Scanner(System.in);
    void takeInput(){
        System.out.print("Enter Arm of Equilateral Triangle : ");
        this.arm = sc.nextDouble();
    }
    void areaofTriangle(){
        this.arm = arm;
        double area = (Math.sqrt(3)/4)*arm*arm;
        System.out.println("The Area of Equilateral Triangle is = " + area);
    }
}
public class equilateral_triangle {
    public static void main(String[] args) {
        EquilateralTri triangle = new EquilateralTri();
        triangle.takeInput();
        triangle.areaofTriangle();
        AreaofTriangle ti = new AreaofTriangle();
        ti.takeUserInput();
        ti.areaOfTriangle();
    }
}
