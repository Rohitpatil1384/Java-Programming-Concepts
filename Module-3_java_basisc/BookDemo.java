class Book {

    String title;
    String author;
    double price;

    
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    
    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
    }

    
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James");
        Book b3 = new Book("Python Guide", "Guido", 499.99);

        b1.display();
        b2.display();
        b3.display();
    }
}