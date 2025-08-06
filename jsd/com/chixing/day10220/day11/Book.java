package chixing.day10220.day11;

public class Book {

    private String bookName;
    private double bookPrice;

    public Book() {
    }

    public Book(String bookName, double bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.bookName, this.bookPrice);
    }

    @Override
    public String toString() {
        return "Book{" + "bookName='" + bookName + '\'' + ", bookPrice=" + bookPrice + '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        if (Double.compare(book.bookPrice, bookPrice) != 0)
            return false;
        return bookName != null ? bookName.equals(book.bookName) : book.bookName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bookName != null ? bookName.hashCode() : 0;
        temp = Double.doubleToLongBits(bookPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
