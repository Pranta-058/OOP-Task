package Discussion4;
class ProductFilter {

    void filterProducts(String category) {
        System.out.println("Searching products in category: " + category);
    }

    void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching products between $" + minPrice + " and $" + maxPrice);
    }

    void filterProducts(String brand, int x) {
        System.out.println("Searching products of brand: " + brand);
    }

    void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching products in category: " + category +
                " between $" + minPrice + " and $" + maxPrice);
    }

    void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Searching products in category: " + category +
                ", brand: " + brand +
                ", between $" + minPrice + " and $" + maxPrice);
    }
}
public class Band_Catagory {
    public static void main(String[] args) {

        ProductFilter product = new ProductFilter();

        product.filterProducts("Electronics");

        product.filterProducts(100, 500);

        product.filterProducts("Apple", 1);

        product.filterProducts("Electronics", 100, 500);

        product.filterProducts("Electronics", 100, 500, "Apple");
    }
}
