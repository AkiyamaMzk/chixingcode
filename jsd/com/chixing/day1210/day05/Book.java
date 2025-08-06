package chixing.day1210.day05;

public class Book {
    private String bookIsbn;
    private String bookName;



    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookIsbn +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }


    private String bookAuthor;
    private boolean avaiable;

    private boolean deleted;

    public Book(String bookIsbn, String bookName, String bookAuthor) {
        this(bookIsbn, bookName, bookAuthor, true);
    }


    public Book(String bookIsbn, String bookName, String bookAuthor, boolean avaiable) {
        this.bookIsbn = bookIsbn;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.avaiable = avaiable;
        this.deleted=false;
    }


    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean isAvaiable() {
        return avaiable;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }
}
