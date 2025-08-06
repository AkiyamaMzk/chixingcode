package chixing.day1210.day10.workwork;

public class Q1211 {

    /*
    1. 以下关于 Java 成员内部类的说法，正确的是：C

A. 成员内部类不能访问外部类的私有成员。 B. 成员内部类不能有静态方法。 C. 创建成员内部类对象必须依附于外部类对象。 D. 成员内部类可以定义在方法内部。

2.关于静态内部类（static nested class），以下说法中错误的是：C

A. 静态内部类可以创建实例而不依附外部类对象 B. 静态内部类不能访问外部类的非静态成员 C. 静态内部类不可以有自己的静态成员 D. 静态内部类可用于模拟“嵌套类结构”并提升封装性

3.执行以下代码的输出是什么？B


public class Outer {
    private String msg = "Outer";

    class Inner {
        String msg = "Inner";

        void print() {
            System.out.println(Outer.this.msg);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();
    }
}
A. Inner
B. Outer
C. 编译错误
D. null
4. 下列关于单例模式的说法错误的是：C

A. 单例模式确保一个类只有一个实例。 B. 饿汉式单例在类加载时就创建实例。 C. 懒汉式单例线程安全性更好。 D. 使用单例模式可以节省内存。

5.

String a = "hello";
String b = "he" + "llo";
System.out.println(a == b);  // 说明理由
A
a在字符串常量池中添加了一个"hello",之后指向"hello"
b通过添加了"he","llo",在添加"hello"时检查到常量池中存在"hello",于是直接指向"hello"

 A. true
 B. false
 C. 编译错误
 D. 运行时异常
String s1 = new String("abc");
String s2 = "abc";
System.out.println(s1 == s2);// 说明理由
B
在通过new创建String时,将在堆内存中直接创建一个String对象,之后将其添加到字符串常量池,再指向堆内存的地址
而通过'='赋值时,将直接指向字符串常量池中的地址
二者实际地址不相同,故使用==对地址进行比较时返回false

A. true
B. false
C. 编译错误
D. 运行时异常
下列关于 StringBuilder 和 String 的描述，正确的是：D
A. StringBuilder 是线程安全的
B. StringBuilder 的 append() 方法每次都会创建新对象
C. String 是可变对象
D. 使用频繁拼接字符串建议使用 StringBuilder
关于下面代码的 replace() 方法调用，输出结果是？C

String str = "abcabc";
str.replace("a", "z");
System.out.println(str);
A. zbcabc
B. zbczbc
C. abcabc
D. 编译错误
执行下面代码后，输出结果是什么？B

String str1 = "Java";
String str2 = str1.concat(" Programming");
System.out.println(str1);
A. Java Programming
B. Java
C. 编译错误
D. null
下面代码的运行结果为（）C
public class foo{
    public static void main (String[] args){
        String s;
        System.out.println("s=" + s);
    }
}
A.	 代码得到编译，并输出“s=”
B.	代码得到编译，并输出“s=null”
C.	由于String s没有初始化，代码不能编译通过
D.	代码得到编译，但捕获到 NullPointerException异常

11 以下程序执行的结果是什么？int

class OverloadDemo{
	void testOverload(int i ){
		System.out.println("int");
	}
	void testOverload(String i ){
		System.out.println("String");
	}
	public static void main(String[] args){
		OverloadDemo a = new OverloadDemo();
		char ch ='x';
		a.testOverload(ch);
	}
}

     */
}
