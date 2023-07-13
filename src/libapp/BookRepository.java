package libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("isbn12345", "Twilight", "Stephenie Mayer", true, "fiction", "A Vampire's love story"));
        books.add(new Book("isbn78234", "The Fountainhead", "Ayn Rand", true, "fiction", "Some book I wanted to read"));
        books.add(new Book("isbn43264", "Angels and Daemons", "Dan Brown", true, "Suspense/Thriller", "A murder mystery"));
        books.add(new Book("isbn18972", "The Da Vinci Code", "Dan Brown", true, "Suspense/Thriller", "A murder mystery"));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
}