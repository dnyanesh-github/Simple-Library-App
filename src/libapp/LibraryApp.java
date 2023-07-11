package libapp;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public BookRepository getBookRepo() {
        return bookRepo;
    }

    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if ( book != null ) {
            System.out.printf("Book found:\n\tTitle: %s \n\tGenre: %s\n\tAuthor: %s\n\t",book.getTitle(),book.getGenre(),book.getAuthor());
        }
        else {
            System.out.printf("\nSorry! Could not find book with ISBN %s", isbn);
        }
    }
}
