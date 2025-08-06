package chixing.dayNull;

import java.util.Objects;

public class vector<E> {
    private Object[] array = null;
    private int size = 0;//记录当前元素数量

    /**
     * 构建一个新的空容器，默认是10个容量的数组
     * constructor a new empty container,  the default value is   an array with ten capacity
     */
    public vector() {
        array = new Object[10];
    }

    /**
     * 构建一个新的空容器，容量是用户指定的初始容量
     * 当容器中添加的数据量很多，可以指定容器初始容量，以便减少扩容次数，和元素复制的次数
     *
     * @param initCapacity 指定的初始容量
     */
    public vector(int initCapacity) {
        array = new Object[initCapacity];
    }

    /**
     * 在容器中添加新元素
     * 默认添加在容器已有元素的尾部，若超过了容器的容量，则扩容为原来的2n+1倍
     *
     * @param ele 新元素
     * @return 返回添加成功
     */
    public boolean add(E ele) {
        if (size >= this.array.length)
            this.expansion();
        this.array[size++] =  ele;
        return true;
    }

    public boolean add(E ele, int index) {
        if (index < 0) return false;
        if (index >= this.size) {
            return add(ele);
        }
        if (this.size >= this.array.length)
            this.expansion();
        for (int i = this.size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = ele;
        size++;
        return true;
    }

    public boolean drop(int index) {
        if (index >= size || index < 0) return false;
        for (int i = index; i < this.size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return true;
    }

    private void expansion() {
        Object[] expansionArray = new Object[this.array.length * 2 + 1];
        System.arraycopy(this.array, 0, expansionArray, 0, this.array.length);
        this.array = expansionArray;
    }


    //获得容器中已有元素的个数
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        res.append('{');
        for (int i = 0; i <size ; i++) {
            res.append(array[i]);
            if(i<size-1) res.append(' ');
        }
        res.append('}');
        return String.valueOf(res);
    }

    public E get(int index){
        try{
            return (E)array[index];
        }catch (IndexOutOfBoundsException e){
            return null;
        }
    }

}
