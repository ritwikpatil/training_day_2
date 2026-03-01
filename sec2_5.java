package day2;

class Book {
    String title, author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | $" + price);
    }
}

public class sec2_5 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Author A", 25.0);
        Book b2 = new Book("Python", "Author B", 30.0);
        b1.display();
        b2.display();
    }
}