package Discussion10;
class Book {

    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    Book(int bookId, String bookName, String bookAuthor,
         String yearOfPub, float price, String status) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    void addNewBook() {
        System.out.println("New book added.");
    }

    void deleteBook() {
        System.out.println("Book deleted.");
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    void inquiryBook() {
        System.out.println("Book inquiry completed.");
    }
}

class Librarian {

    int id;
    String name;

    Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void searchBook(String name) {
        System.out.println("Searching book: " + name);
    }

    boolean verifyMember(int id) {
        System.out.println("Verifying member ID: " + id);
        return true;
    }

    void orderBooks() {
        System.out.println("Books ordered.");
    }

    void sellBooks() {
        System.out.println("Book sold.");
    }
}

class Publisher {

    int id;
    String name;
    String address;
    int phoneNo;

    Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    void addPub() {
        System.out.println("Publisher added.");
    }

    void modifyPub() {
        System.out.println("Publisher modified.");
    }

    void deletePub() {
        System.out.println("Publisher deleted.");
    }

    void orderStatus() {
        System.out.println("Order status checked.");
    }
}

class User {

    int userId;
    String userName;
    String userAddress;
    int phoneNo;

    User(int userId, String userName,
         String userAddress, int phoneNo) {

        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    void returnBooks() {
        System.out.println("Book returned.");
    }

    int payFine() {
        System.out.println("Fine paid.");
        return 0;
    }

    void addNewUser() {
        System.out.println("New user added.");
    }

    void deleteUser() {
        System.out.println("User deleted.");
    }

    void updateDetails() {
        System.out.println("User details updated.");
    }

    void bookPurchase() {
        System.out.println("Book purchased.");
    }
}
public class ImplementScenario {
    public static void main(String[] args) {

        Book book = new Book(
                101,
                "Java Programming",
                "James Gosling",
                "2023",
                550,
                "Available"
        );

        Librarian librarian =
                new Librarian(1, "Rahim");

        Publisher publisher =
                new Publisher(10,
                        "ABC Publisher",
                        "Dhaka",
                        12345);

        User user =
                new User(1001,
                        "Karim",
                        "Chittagong",
                        98765);

        book.displayBookDetails();

        librarian.searchBook("Java Programming");

        user.bookPurchase();

        publisher.orderStatus();
    }
}
