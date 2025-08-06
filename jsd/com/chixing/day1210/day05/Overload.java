package chixing.day1210.day05;

public class Overload {
    //(1) 是重载
    public class ExampleA {
        public void test(int a, double b) { }
        public void test(double b, int a) { }
    }


    //(2)是重载
    public class ExampleB {
        public void compute(Integer a) { }
        public void compute(int a) { }
    }


    //(3)不是重载
    public class ExampleC {
      //  public void run(String s) { }
        public String run(String s) { return s; }
    }




}
