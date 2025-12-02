public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Constructor 1: title + author
    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
    }

    // Constructor 2: title + author + price
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + ((int) price) + "]";
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling");
        Book b3 = new Book("Advanced Java", "Oracle", 499);

        b1.display();
        b2.display();
        b3.display();

        // Print using overridden toString()
        Book example = new Book("Java", "Author", 500);
        System.out.println(example); // prints: Book[title=Java, price=500]
    }
}
