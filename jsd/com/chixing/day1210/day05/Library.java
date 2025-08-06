package chixing.day1210.day05;

import java.util.HashSet;
import java.util.Scanner;

public class Library {
    private Book[] allBooks = null;
    private int size = 0;//记录当前元素数量
    private HashSet<String> isbnSet=new HashSet<>(); // 快速查重用

    private static final Scanner SCANNER = new Scanner(System.in);


    /**
     * 构建一个新的空容器，默认是10个容量的数组
     * constructor a new empty container,  the default value is   an array with ten capacity
     */
    public Library() {
        allBooks = new Book[10];
    }

    /**
     * 构建一个新的空容器，容量是用户指定的初始容量
     * 当容器中添加的数据量很多，可以指定容器初始容量，以便减少扩容次数，和元素复制的次数
     *
     * @param initCapacity 指定的初始容量
     */
    public Library(int initCapacity) {
        allBooks = new Book[initCapacity];
    }

    /**
     * 在容器中添加新元素
     * 默认添加在容器已有元素的尾部，若超过了容器的容量，则扩容为原来的2n+1倍
     *
     * @param book 新元素
     * @return 返回添加成功
     */
    public boolean addBook(Book book) {
        if(book==null){
            System.out.println("传入了错误信息");
            return false;
        }
        if (size >= this.allBooks.length)
            this.expansion();

        if(book.getBookIsbn()!=null&&!isbnSet.contains(book.getBookIsbn())&&!book.isDeleted()){
            this.allBooks[size++] = book;
            isbnSet.add(book.getBookIsbn());
        }
        else {
            System.out.println("已被使用的编号或编号为空\n是否重新输入编号？(Y/N)");
            char input= SCANNER.nextLine().trim().charAt(0);
            if(input=='Y'){
                String newIsbn= SCANNER.nextLine();
                addBook(new Book(newIsbn,book.getBookName(),book.getBookAuthor()));
                return true;
            }
            if(input!='N')
                System.out.println("请输入大写Y或N");
            else
                System.out.println("录入书籍中断");
            return false;
        }
        System.out.println("录入成功："+book);
        return true;
    }

    public boolean deleteBook(String bookIsbn){
        Book book = getBookByISBN(bookIsbn);
        if (book == null || book.isDeleted()) {
            System.out.println("该编号无书籍或该书籍已被删除");
            return false;
        }
        book.setDeleted(true);
        book.setAvaiable(false);
        isbnSet.remove(book.getBookIsbn());
        return true;

    }

    public void expansion() {
        Book[] expansionArray = new Book[this.allBooks.length * 2 + 1];
        for (int i = 0; i < this.allBooks.length; i++)
            expansionArray[i] = this.allBooks[i];
        this.allBooks = expansionArray;
    }


    //获得容器中已有元素的个数
    public int size() {
        return this.size;
    }

    /**
     * 打印输出容器中已有元素
     */
    public void displayAvailableBooks() {
        for (int i = 0; i < size; i++)
            if (allBooks[i].isAvaiable()) System.out.println(this.allBooks[i]);
        // for array
    }

    public Book getBookByISBN(String isbn){
        for(int i=0;i<size;i++){
            if(this.allBooks[i]!=null
                    &&this.allBooks[i].getBookIsbn()!=null
                    && allBooks[i].getBookIsbn().equals(isbn))
                return allBooks[i];
        }
        System.out.println("暂无此书");
        return null;
    }

}
