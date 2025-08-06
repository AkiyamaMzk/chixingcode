package chixing.day10220.day12.hwork.Q10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static  List<Book> lib = new ArrayList<>();
    private static Library library=new Library();
    private Library() {
    }

    public static Library getInstance() {
        return library;
    }

    public void add(Book book) {
        lib.add(book);
    }

    public Book getBookByName(String bookName) {
        for (Book b : lib) {
            if (b.getBookName().equals(bookName)&&b.isAvailable())
                return b;
        }
        return null;
    }

    public Book[] getBookByAuthor(String bookAut){
        List<Book> books=new ArrayList<>();
        for(Book b:lib){
            if(b.getBookAuthor().equals(bookAut)&&b.isAvailable())
                books.add(b);
        }
        return books.toArray(new Book[0]);
    }
    public void deleteByBookName(String bookName){
        try{
            lib.get(lib.indexOf(getBookByName(bookName))).setAvailable(false);
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println("不存在这本书");
        }
    }
    public void showAllBooks(){
        for(Book b:lib){
            if(b.isAvailable()) System.out.println(b);
        }
    }
}

