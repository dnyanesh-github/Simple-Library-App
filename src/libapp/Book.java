package libapp;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isInStock;
    private String genre;
    private String description;

    public Book(String isbn, String title, String author, boolean isInStock, String genre, String description) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isInStock = isInStock;
        this.genre = genre;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
