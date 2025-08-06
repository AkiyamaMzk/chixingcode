package chixing.day1210.day08_abstract.homework;

public class Q1to9 {
    /*

    public class Cygnus{
  static int value = 9;

   private void printValue(){
      int value = 69;
      System.out.println(this.value);
  }

  public static void main(String[] args) throws Exception{
      new Cygnus().printValue();
  }

}
这个程序会有下面哪种结果？  B
A. 编译错误
B. 打印9
C. 打印69
D. 运行时抛出异常
2. 写出以下程序的输出结果
public class Test {

 static{
     System.out.println("test static 1");
 }
 public static void main(String[] args) {

 }

 static{
     System.out.println("test static 2");
 }

}
public class test{
	static{
		 int x=5;
	}
	static int x,y;
	public static void main(String args[]){
   		x--;
   		myMethod( );
   		System.out.println(x+y+ ++x);

	}
	public static void myMethod( ){

  		y=x++ + ++x;
	}
}D
A.	编译错误
B.	输出：1
C.	输出：2
D.	输出：3
E.	输出：7
F.	输出：8
4. 以下代码的输出结果是？
public class B{
    public static B t1 = new B();
    public static B t2 = new B();

	{
   		 System.out.println("构造块");
	}

	static{
    	System.out.println("静态块");
	}

	public static void main(String[] args){
   		 B t = new B();
	}
 }C

A.	静态块 构造块 构造块 构造块
B.	构造块 静态块 构造块 构造块
C.	构造块 构造块 静态块 构造块
D.	构造块 构造块 构造块 静态块

5. 下面代码在main方法代码后可以正常使用的是（ ）
public class Test{
    private int a=10;
    int b=20;
    static int c=1;

    public static void main(String arg[]){
        Test t = new Test();


    }


 }
 D

A.	t.a
B.	this.c
C.	Test.b
D.	Test.c

6. 以下代码执行后输出结果为（ ）
public class Test{
    public static Test t1 = new Test();
	{
    	 System.out.println("blockA");
	}

	static{
    	System.out.println("blockB");
	}

    public static void main(String[] args){
        Test t2 = new Test();
	}
}
A
A.	blockAblockBblockA
B.	blockAblockAblockB
C.	blockBblockBblockA
D.	blockBblockAblockB
7. 判断以下方法是不是方法重载
public void fun1(int x,int y){}
public void fun1(int a,int b){}不是
public void fun1(int x,long y){}是
public int fun1(int x){..}
public int fun1(long  y,int x){..}是
8.判断以下方法是不是方法重写
class A{
    public void study(int x,int y){ ..}
    private void play(int x,int y){ ..}
}

class B extends A{
     public void study(int a,int b){ ..}是
     public void play(int x,int y){ ..}不是
}

class C extends A{
     public void study(char a,char b){ ..}不是
}

class D extends A{
     public void study2(char a,char b){ ..}不是
     protected void study(int a,int b){ ..}是
     public void study(float a,float b){ ..}不是
}


9.写出以下程序执行结果，有误的请指出

class Pet{
    public void run(){
       System.out.println("pet is running");
    }
}

class Dog extends Pet{
    public void run(){
       System.out.println("dog is running");
    }
}
//测试类
class Test{
    public static void main(String[] args){
        Pet p1 =  new Dog();
        System.out.println(p1 instanceof Dog); true
        System.out.println(p1 instanceof Pet); true
        p1.run(); dog is running

        Dog d1 = (Dog)p1;
        System.out.println(d1 instanceof Dog); ture
        System.out.println(d1 instanceof Pet); true
        d1.run();dog is running

        Pet p2 =  new Pet();
        Dog d2 = (Dog)p2;无法转换
        System.out.println(d2 instanceof Dog);
        System.out.println(d2 instanceof Pet);
    }
}
输出:
true
true
dog is running
true
true
dog is running
抛出异常
     */
}
