package chixing.day1210.day09_static_interface.interfaces.homework;

public class Q123 {

//    1.阅读下列程序，选择哪一个是正确的输出结果
//
//class HelloA{
//	public HelloA()	{
//        	System.out.println("I’m A class ");
//    	}
//	static{
//	    	System.out.println("static A");
//	}
//}
//
//public class HelloB extends HelloA{
//    public HelloB(){
//        System.out.println("I’m B class");
//    }
//    static{
//        System.out.println("static B");
//    }
//
//
//	public static void main (String[] args){
//    	new HelloB();
//	}
//}
//C
//A.	static A I’m A class static B I’m B class
//B.	I’m A class I’m B class static A static B
//C.	static A static B I’m A class I’m B class
//D.	I’m A class static A I’m B class static B
//2.下列程序执行后结果为( )
//
//class A {
//    public int func1(int a, int b) {
//        return a - b;
//    }
//}
//class B extends A {
//    public int func1(int a, int b) {
//        return a + b;
//    }
//}
//
//public class ChildClass {
//    public static void main(String[] args) {
//    A a = new B();//
//    B b = new B();
//    System.out.println("Result=" + a.func1(100, 50));
//    System.out.println("Result=" + b.func1(100, 50));
//    }
//}
//A
//A.	Result=150Result=150
//B.	Result=100Result=100
//C.	Result=100Result=150
//D.	Result=150Result=100
//3.下列程序执行后结果为( )
//
// class Base{
//    	static{
//     		System.out.println("base static");
// 		}
//   		 public Base(){
//     		System.out.println("base constructor");
// 		}
//}
//
//public class Test extends Base{
//
//		static{
//   			 System.out.println("test static");
//		}
//
//		public Test(){
//			super();
//   			 System.out.println("test constructor");
//		}
//
//		public static void main(String[] args) {
//    			new Test();
//		}
//}
//    base static
//    test static
//    base constructor
//    test constructor
//
}
