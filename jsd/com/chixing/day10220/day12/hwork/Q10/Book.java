package chixing.day10220.day12.hwork.Q10;

public class Book {
    private String bookName;
    private String bookAuthor;
    private double price;
    private boolean available;

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String bookName, String bookAuthor, double price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.available=true;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                '}';
    }
}
