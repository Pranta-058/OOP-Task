package Discussion7;
class Book {

    String title;
    String author;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}
public class library {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming");

        Book book2 = new Book("Clean Code", "Robert C. Martin");

        book1.showDetails();
        book2.showDetails();
    }

}
