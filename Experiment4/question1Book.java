public class question1Book {
    public static void main(String[] args) {
        book book1 = new book();
        book book2 = new book("Book", "John Doe", 2023);

        System.out.println("\nDetails of first book:");
        book1.displayBook();

        System.out.println("\nDetails of second book:");
        book2.displayBook();
    }
}

class book{
    private String title;
    private String author;
    private int year;
    public book() {
        this("Untitled", "Unkown Author", -1);
    }
    public book(String title, String author) {
        this(title, author, -1);
    }
    public book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (year != -1) {
            System.out.println("Published in Year: " + year);
        }
    }
}