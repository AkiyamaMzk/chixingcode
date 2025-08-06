package chixing.day10220.day12.hwork.Q10;

import java.util.Arrays;

public class LibTest {
    public static void main(String[] args) {
        Library lib=Library.getInstance();
        for (int i = 0; i <10 ; i++) {
            lib.add(new Book("book"+i,"author"+i,i*2.5));
        }
        lib.add(new Book("book","author1",2.5));
        System.out.println(Arrays.toString(lib.getBookByAuthor("author1")));
        System.out.println(lib.getBookByName("book1"));
        lib.deleteByBookName("book2");
        lib.showAllBooks();
    }
}
