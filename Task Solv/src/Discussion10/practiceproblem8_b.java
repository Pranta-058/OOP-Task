package Discussion10;
class Restaurant {
    protected String name;
    protected double foodPrice;

    public Restaurant(String name, double foodPrice) {
        this.name = name;
        this.foodPrice = foodPrice;
    }

    public double calculateTotalBill() {
        return foodPrice + (foodPrice * 0.10);
    }

    public int estimateDeliveryTime() {
        return 40;
    }

    public void display() {
        System.out.println("Restaurant: " + name);
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Total Bill: " + calculateTotalBill());
        System.out.println("Delivery Time: " + estimateDeliveryTime() + " mins");
    }
}

class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant(String name, double foodPrice) {
        super(name, foodPrice);
    }

    @Override
    public double calculateTotalBill() {
        return foodPrice + (foodPrice * 0.15);
    }

    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {

    public FineDiningRestaurant(String name, double foodPrice) {
        super(name, foodPrice);
    }

    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}

public class practiceproblem8_b {
    public static void main(String[] args) {

        Restaurant r1 =
                new Restaurant("Regular Restaurant", 1000);

        FastFoodRestaurant r2 =
                new FastFoodRestaurant("Burger King", 1000);

        FineDiningRestaurant r3 =
                new FineDiningRestaurant("Royal Dining", 1000);

        System.out.println("=== Regular Restaurant ===");
        r1.display();

        System.out.println();

        System.out.println("=== Fast Food Restaurant ===");
        r2.display();

        System.out.println();

        System.out.println("=== Fine Dining Restaurant ===");
        r3.display();
    }
}
