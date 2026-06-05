package Discussion7;
class Car {

    String owner;
    String brandName;
    String serialNumber;
    double fuel;

    Car(String owner, String brandName, String serialNumber, double fuel) {
        this.owner = owner;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
    }

    void startCar() {
        System.out.println(brandName + " car has started.");
    }

    void stopCar() {
        System.out.println(brandName + " car has stopped.");
    }

    void checkFuel() {
        System.out.println("Fuel available: " + fuel + " liters");
    }

    void showDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brandName);
        System.out.println("Serial Number: " + serialNumber);
    }
}

public class CarAttribute {
    public static void main(String[] args) {

        Car car1 = new Car("Rahim", "Toyota", "TY12345", 25.5);

        car1.showDetails();
        car1.startCar();
        car1.checkFuel();
        car1.stopCar();
    }
}
