package chixing.day1210.day05;

public class BookTest {
    public static void main(String[] args) {
        Library lib=new Library();
        User user=new User(1);
        for(int i=0;i<20;i++){
            lib.addBook(new Book("testType"+String.valueOf(i+1),"测试书籍"+(i+1),"测试作者"+(i+1),true));
        }
        lib.displayAvailableBooks();
        user.borrowBook(lib.getBookByISBN("testType17111"));
        user.borrowBook(lib.getBookByISBN("testType17"));
        user.borrowBook(lib.getBookByISBN("testType11"));
        user.borrowBook(lib.getBookByISBN("testType12"));
        user.listBorrowedBooks();
        user.returnBook("1");
        user.returnBook("1999");
        user.returnBook("17");
        user.returnBook("11");
        user.returnBook("11");
        user.listBorrowedBooks();
        user.borrowBook(lib.getBookByISBN("testType20"));
        user.borrowBook(lib.getBookByISBN("testType20"));
        user.borrowBook(lib.getBookByISBN("testType3"));
        user.borrowBook(lib.getBookByISBN("testType1"));
        user.listBorrowedBooks();
        //lib.displayAvailableBooks();
        Library Biglib=new Library(500000);
        Library minlib=new Library(0);
        minlib.displayAvailableBooks();
        minlib.addBook(lib.getBookByISBN("1"));
        lib.addBook(null);
        lib.addBook(new Book(null,"testNullIsbn",null));
        lib.addBook(new Book("123456","repeatId1",null));
        lib.addBook(new Book("123456","repeatId2",null));

        user.clearBorrowedBooks();
        user.borrowBook(lib.getBookByISBN(null));



    }
}

