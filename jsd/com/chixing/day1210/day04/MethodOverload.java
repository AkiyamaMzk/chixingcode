package chixing.day1210.day04;

/**
 * 方法重载
 * 方法の名前は同じ
 * 方法的参数不一样
 * 当前方法参数列表不满足需求的时候，需要定义同名的方法
 */
public class MethodOverload {
    public static void main(String[] args) {

    }
    public static int add(int... x){
        int sum=0;
        for(int num:x)
            sum+=num;
        return sum;
    }


}
