package chixing.day1210.day07_inherited.homework;

public class Question3 {
    class Shape {
        public void draw() {
            System.out.println("Drawing Shape");
        }
    }

    class Circle extends Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Square extends Shape {
        public void draw() {
            System.out.println("Drawing Square");
        }
    }

    public class Test {
//        public static void main(String[] args) {
//            Shape s1 = new Circle();
//            Shape s2 = new Square();
//            s1.draw();
//            s2.draw();
//        }
    }
}
/*
输出:
Drawing Circle
Drawing Square
Shape s1与s2所指堆地址中的draw()为子函数重写后的draw()
 */
