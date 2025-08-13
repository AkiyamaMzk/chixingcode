package chixing.day10220.day18.synchronized_demo;

public class Account {
    private double banlance;
    private String name;
    //属性
    //构造函数,get,set
    public double getBanlance() {
        return banlance;
    }
    public String getName() {
        return name;
    }

    public Account(String name,double banlance) {
        this.banlance = banlance;
        this.name = name;
    }
    //存款
    public  double depoist(double money){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } //模拟实际存款代码需要执行的时间
        updateBanlance(money);
        System.out.println("存款后 当前余额是：" + this.banlance);
        return banlance;
    }

    //取款
    public  double withdraw(double money){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//模拟实际存款代码需要执行的时间
        updateBanlance(-money);
        System.out.println("取款 当前余额是：" + this.banlance);
        return banlance;
    }


    private synchronized void updateBanlance(double banlance) {
        this.banlance += banlance;
    }


}
