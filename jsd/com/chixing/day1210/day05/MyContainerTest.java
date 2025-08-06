package chixing.day1210.day05;


public class MyContainerTest {
    public static void main(String[] args) {
        // 创建了一个空容器，是一个int[] ， length = 10
        MyContainer container1 = new MyContainer();
        container1.add(11);  // 添加新元素11， 默认添加的容器尾部
        container1.add(0);
        container1.add(21);
        container1.add(22);
        container1.add(23);
        // for(.....)   可用for循环批量添加

        for (int i=0;i<10;i++){
            container1.add(i+1);
        }
        container1.add(99, 5);// 添加元素99 在第6个位置上
        container1.remove(2); // 删除第2个位置上的元素

        int size = container1.size();
        container1.print();

        //创建了另一个空容器是一个int[] ， length = 10
        MyContainer container2 = new MyContainer(5000);
        MyContainer mintainer=new MyContainer();
        mintainer.remove(-1);
    }
}



