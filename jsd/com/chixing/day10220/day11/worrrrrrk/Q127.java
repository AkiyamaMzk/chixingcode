package chixing.day10220.day11.worrrrrrk;

public class Q127 {
    /*
    以下声明合法的是（B） A. default String s; B. public final static native int w(); C. abstract double d; D. abstract final double hyperbolicConsine();

下面哪些变量的定义不正确（B） A． int $a =10; B． float f =10.1; C． long _int =120; D． String[] str={“a”,”b”,”c”,”d”};

3)下列说法正确的有（BC） A. class中的constructor不可省略 B. constructor必须与class同名，但方法不能与class同名 C. constructor在一个对象被new时执行 D. 一个class只能定义一个constructor

下列语句正确的是（A） A. 形式参数可被视为localvariable B. 形式参数可被字段修饰符修饰 C. 形式参数为方法被调用时，真正被传递的参数 D. 形式参数不可以是对象
5）.阅读以下程序，写出输出结果
in Second class

class First{
	public First(){
		aMethod();
	}

	public void aMethod(){
		System.out.println("in First class");
	}
}

public class Second extends First{
	public void aMethod(){
		System.out.println("in Second class");
	}

	public static void main(String[] args){
		new Second();
	}
}


6）

 class Parent {
    static int count = 10;

    static void print() {
        System.out.println("Parent: " + count);
    }
}

class Child extends Parent {
    static int count = 20;

    static void print() {
        System.out.println("Child: " + count);
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
        System.out.println(p.count);
    }
}
🧠 问题：程序输出是什么？为什么？
Child:20    内存中p的类型为Child,将会调用Child.println
10          静态字段由引用类型决定,访问了Perent.count
7）
Meow
Animal
class Animal {
    void speak() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Cat[2];
        animals[0] = new Cat();
        animals[1] = new Animal(); // 会报错吗？


        for (Animal a : animals) {
            a.speak();
        }
    }
}
     */
}
