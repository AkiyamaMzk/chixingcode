package chixing.day10220.day13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import chixing.day10220.day11.Book;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Ciallo");
        set.add("Hello");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println();
        Set<Book> bookset = new TreeSet<>();
        bookset.add(new Book("java程序设计", 10));
        bookset.add(new Book("c++程序设计", 20));
        bookset.add(new Book("py程序设计", 30));
        bookset.add(new Book("py程序设计", 30));
        for (Book b : bookset) {
            if (b.getBookName().equals("java程序设计")) {
                b.setBookPrice(b.getBookPrice()+10);
            }
            System.out.println(b);
        }
    }
}
