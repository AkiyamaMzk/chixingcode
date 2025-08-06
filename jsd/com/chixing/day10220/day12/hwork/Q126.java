package chixing.day10220.day12.hwork;

public class Q126 {
    /*
    1. 描述 int 与 Integer 的区别（常见面试题）
    int是基本数据类型，储存在栈内存中，默认值为0
    Integer是封装类，栈内存中储存引用类型，堆内存中储存int类型，默认值为null
2. Java中的泛型是什么 ? 使用泛型的好处是什么?（常见面试题）
    参数化类型机制，允许在方法，类，接口中指定类型参数
    提高安全性   编译时检查类型，避免运行时转换错误
    减少代码量   可同时用于不同数据类型

3.什么是装箱拆箱？（常见面试题）
装箱：将基本数据类型转换为对应的封装类
拆箱：将封装类转为基本类型

4. 将字符串 "45.6" 转换成数值
Double.parseDouble("45.6");

5. 阅读程序题，写结果
  public class Test{

      public static String output = "";
      public static void foo(int i){
          try{
              if(i ==1){
                  throw new Exception();
              }
              output +="1";
          }catch(Exception e){
              output += "2";
              return;
          }finally{
          	 output += "3";
		  }
          	output += "4";
      }

      public static void main(String[] args){
          foo(0);
          foo(1);
      }
      //程序执行后，变量"output"的值是多少
  }13423
6.集合框架有哪些接口和类，区别都是什么
        根接口 Collection
        子接口：List（元素可重复） set（不可重复） Queue（队列）
        实现子类：List：ArrayList（数组） LinkedList（链表） Vector（线性安全数组）
                 set： hashset treeset

     */


}
