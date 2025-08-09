package chixing.day10220.day15.work.Q5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class LRUCache extends LinkedHashMap {
    int capacity;

    public LRUCache(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
        capacity = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry eldest) {
        return capacity < size();
    }

    @Override
    public Object get(Object key) {
        Object res = super.get(key);
        if (res == null)
            return -1;
        return res;
    }

    @Override
    public Object put(Object key, Object value) {
        if (this.containsKey(key))
            return update(key, value);
        return super.put(key, value);
    }

    public Object update(Object key, Object value){
        //更新值不改变顺序
        for (Object object : super.entrySet()) {
            Map.Entry<Integer,Integer> entry=(Map.Entry)object;
            if(Objects.equals(entry.getKey(), key))
                entry.setValue((int)value);
        }//没有提交链接
        return null;
    }

}

public class Q5 {
    static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SC.nextInt();
        LRUCache lruCache = new LRUCache(n, 0.75f, true);
        try {
            while (true) {
                char c = SC.next().charAt(0);
                if (c == 'p') {
                    int key = SC.nextInt();
                    int value = SC.nextInt();
                    lruCache.put(key, value);
                }
                if (c == 'g') {
                    int key = SC.nextInt();
                    System.out.println(lruCache.get(key));
                }
            }
        } catch (Exception e) {
            System.out.println("EOF");
        }

    }

}
