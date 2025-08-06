package chixing.day1210.day07_inherited.homework;

public class Question2 {

    class A {
        A() {
            System.out.println("A constructor");
        }
    }

    class B extends A {
        B() {
            System.out.println("B constructor");
        }
    }

    public class Test {
        public static void main(String[] args) {
        //    B d = new B();
        }
    }
    /*
    1.
    输出:
    A constructor
    B constructor
    运行new B()时,执行B的构造函数,B的构造函数中默认存在A的构造函数且会先于B()中的语句运行
    2.不会改变,因为B()仍然会执行A的无参数构造函数
     */
}
