package chixing.day10220.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        // 1. 添加5个任意字符串
        for (int i = 0; i <4 ; i++) {
            list.add(String.valueOf("test"+i));
        }
    
        list.add("code");
        // 2.  添加"help" 在第二个位置上
        list.add(1,"help");
        // 3. 获得集合list 中元素的个数
        System.out.println( list.size());
        // 4. 循环遍历书输出list中元素的值
        for (String s : list) {
            System.out.println(s);
        }
        // 5. 判断集合中 是否包含 "code" 元素
        System.out.println(list.contains("code"));
        // 6. 获得第3个位置上的元素
        System.out.println(list.get(2));
        // 7. 获得倒数第2个位置上的元素
        System.out.println(list.get(list.size()-2));
        // 8. 字符串"code" 第一次出现的下标是什么
        System.out.println( list.indexOf("code"));
        // 9. 删除“help” 这个元素
        list.remove("help");
        // 10. 删除 第二个位置上的元素
        list.remove(list.get(1));
        // 11. 将第一个位置上的元素 替换成是 "view"
        list.set(0,"view");
        list.add("view");
        //迭代器
        System.out.println();
        Iterator<String > it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        list.stream().forEach(System.out::println);
    }
}
