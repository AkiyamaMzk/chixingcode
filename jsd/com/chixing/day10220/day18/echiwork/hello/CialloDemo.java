package chixing.day10220.day18.echiwork.hello;

public class CialloDemo extends Thread {


    public static void main(String[] args) {
        String[] employees = {"张三", "李四", "王五", "赵六"};
        for (String name : employees) {
            CialloDemo t=new CialloDemo();
            t.setName(name);
            t.start();
            try {
                Thread.sleep((long) (Math.random()*2000+1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        System.out.println(this.getName() + ":Ciallo~(∠ • ω < )⌒☆ , 我是" + this.getName());
        
    }

}