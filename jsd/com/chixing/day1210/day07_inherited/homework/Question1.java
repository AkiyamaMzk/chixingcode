package chixing.day1210.day07_inherited.homework;

public class Question1 {
    class Parent {
        protected void show() {
            System.out.println("Parent");
        }
    }

    class Child extends Parent {
        // 请填写合适的访问权限
        protected void show() {
            System.out.println("Child");
        }
    }
    //如果将 Parent 中的 show() 改为 private,Parent.show将不被继承到Child中,结果无变化
}
