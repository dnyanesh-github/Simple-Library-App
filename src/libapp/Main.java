package libapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the library app");
        LibraryApp app = new LibraryApp();
        System.out.print("Search by(isbn/title/author): ");
        String searchBy = keyboard.next();

        switch (searchBy.toLowerCase()) {
            case "isbn":
                System.out.println("____________________________");
                System.out.println("Searching by isbn");
                System.out.print("Please enter the isbn number: ");
                String isbn = keyboard.next();
                app.searchByIsbn(isbn);
                break;
            case "title":
                System.out.println("____________________________");
                System.out.println("Searching by title:");
                System.out.print("Please enter the title ");
                String title = keyboard.next();
                app.searchByTitle(title);
                break;
            case "author":
                System.out.println("____________________________");
                System.out.println("Searching by author");
                System.out.print("Please enter the author name: ");
                String author = keyboard.next();
                app.searchByAuthor(author);
                break;
            default:
                System.out.println("____________________________");
                System.out.println("Wrong search criteria");
                break;
        }
    }
}