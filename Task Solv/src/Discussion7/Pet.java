package Discussion7;
class Dog {

    String name;
    int age;
    String breed;

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    void spin() {
        System.out.println(name + " is spinning.");
    }

    void run() {
        System.out.println(name + " is running.");
    }
}

public class Pet {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Tommy", 3, "German Shepherd");

        dog1.showDetails();
        dog1.bark();
        dog1.spin();
        dog1.run();
    }
}
