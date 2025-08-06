package chixing.day1210.day05;

import java.util.HashSet;

public class User {
    private int userId;
    private String userName;
    private Book[] borrowedBooks = {null, null, null};
    private int borrowNums = 0;



    public boolean borrowBook(Book book) {
        if (book == null) {
            System.out.println("book is null");
            return false;
        }
        if (!book.isAvaiable()) {
            System.out.println("not avaible");
            return false;
        }
        if (borrowNums >= 3) {
            System.out.println("最多允许借三本书");
            return false;
        }
        System.out.println("borrow success:" + book.getBookName());
        book.setAvaiable(false);
        borrowedBooks[borrowNums++] = book;
        return true;
    }


    public boolean dropBook(int index){
        if(index>=borrowNums||index<0) return false;
        for(int i=index;i<borrowNums-1;i++){
            borrowedBooks[i]=borrowedBooks[i+1];
        }
        borrowedBooks[borrowNums-1]=null;
        borrowNums--;
        return true;
    }


    public boolean returnBook(String isbn) {
        for (int i = 0; i < 3; i++) {
            if (borrowedBooks[i] != null && borrowedBooks[i].getBookIsbn().equals(isbn)) {
                System.out.println("return success:"+borrowedBooks[i].getBookName());
                borrowedBooks[i].setAvaiable(true);
                dropBook(i);
                return true;
            }
        }
        System.out.println("not found");
        return false;
    }

    public void listBorrowedBooks() {
        for (int i = 0; i < borrowNums; i++)
            System.out.println(this.borrowedBooks[i] + " ");
        // for array
    }

    public void clearBorrowedBooks(){
        for (int i = borrowNums-1; i >= 0; i--)
            returnBook(this.borrowedBooks[i].getBookIsbn());
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User(int userId) {
        this.userId = userId;
    }


}
