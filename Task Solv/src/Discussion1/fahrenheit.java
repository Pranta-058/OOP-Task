package Discussion1;
import java.util.Scanner;
class CelsiusToFahrenheit{
    public double celsious;
    public Scanner sc = new Scanner(System.in);
    void userinput(){
        System.out.print("Enter Temperature celsious : ");
        this.celsious = sc.nextDouble();
    }
    void covertCeltoFahrenheit(){
        this.celsious = celsious;
        double fahrenheit = (celsious*9)/5 + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}

public class fahrenheit {
    public static void main(String[] args) {
        CelsiusToFahrenheit f = new CelsiusToFahrenheit();
        f.userinput();
        f.covertCeltoFahrenheit();
    }
}
