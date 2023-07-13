package libapp;

public class LibraryApp {
    final BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        respondWithResult(book, "ISBN");
    }

    public void searchByTitle(String title) {
        Book book = bookRepo.findByTitle(title);
        respondWithResult(book, "Title");
    }

    public void searchByAuthor(String author) {
        Book book = bookRepo.findByAuthor(author);
        respondWithResult(book, "Author");
    }

    public void respondWithResult(Book book, String searchType) {
        if (book != null) {
            System.out.printf("Book found:\n\tTitle: %s \n\tGenre: %s\n\tAuthor: %s\n\t", book.getTitle(), book.getGenre(), book.getAuthor());
        } else {
            System.out.printf("\nSorry! Could not find book with this %s.", searchType);
        }
    }
}
