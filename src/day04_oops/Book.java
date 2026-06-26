package day04_oops;

public class Book {
    // Fields
    String title;
    String author;
    double price;

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : $" + this.price);
    }

    // Main method to test the class with two objects
    public static void main(String[] args) {
        // Creating the first book object
        Book b1 = new Book("Atomic Habits", "James Clear", 15.99);
        b1.display();

        System.out.println("--------------------");

        // Creating the second book object
        Book b2 = new Book("Deep Work", "Cal Newport", 18.50);
        b2.display();
    }
}