package chixing.day1210.day05;


public class MyContainer {
    private int[] array = null;
    private int size = 0;//记录当前元素数量

    /**
     * 构建一个新的空容器，默认是10个容量的数组
     * constructor a new empty container,  the default value is   an array with ten capacity
     */
    public MyContainer() {
        array = new int[10];
    }

    /**
     * 构建一个新的空容器，容量是用户指定的初始容量
     * 当容器中添加的数据量很多，可以指定容器初始容量，以便减少扩容次数，和元素复制的次数
     *
     * @param initCapacity 指定的初始容量
     */
    public MyContainer(int initCapacity) {
        array = new int[initCapacity];
    }

    /**
     * 在容器中添加新元素
     * 默认添加在容器已有元素的尾部，若超过了容器的容量，则扩容为原来的2n+1倍
     *
     * @param ele 新元素
     * @return 返回添加成功
     */
    public boolean add(int ele) {
        if (size >= this.array.length)
            this.expansion();
        this.array[size++] = ele;
        return true;
    }

    public boolean add(int ele, int index) {
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

    public boolean remove(int index) {
        if (index >= size || index < 0) return false;
        for (int i = index; i < this.size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = 0;
        size--;
        return true;
    }

    public void expansion() {
        int[] expansionArray = new int[this.array.length * 2 + 1];
        for (int i = 0; i < this.array.length; i++)
            expansionArray[i] = this.array[i];
        this.array = expansionArray;
    }


    //获得容器中已有元素的个数
    public int size() {
        return this.size;
    }

    /**
     * 打印输出容器中已有元素
     */
    public void print() {
        for (int i = 0; i < size; i++)
            System.out.print(this.array[i] + " ");
        System.out.println();
        // for array
    }


}

