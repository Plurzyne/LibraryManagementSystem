package Book;

import java.util.*;

class Book {
    // Properties of a book
    String title;
    String author;
    long pages;
    boolean availability;
    double price;


    // Initializing the properties of a book
    public Book(String title,
                String author,
                long pages,
                double price,
                boolean availability) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.availability = availability;
    }

    // Displaying a details of a book

    public static void main(String[] args) {
        Book b = new Book("Java", "James Gosling", 248, 39.99, true);
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Pages: " + b.pages);
        System.out.println("Price: $" + b.price);
        System.out.println("Availability: " + b.availability);

    }
}
