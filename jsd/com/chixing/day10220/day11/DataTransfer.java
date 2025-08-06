package chixing.day10220.day11;

public class DataTransfer {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        fun1(a,b);
        Book book=new Book("data",99.9);
        System.out.println(a+","+b);//1,2
        fun2(book);
        System.out.println(book.getBookName());//java
        System.out.println(book.getBookPrice());//89.9
    }
    public static void fun1(int a,int b){
        a=10;
        b=29;
    }
    public static void fun2(Book book){
        book.setBookName("java");
        book.setBookPrice(89.9);
    }
}
