package chixing.day1210.day01;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {48, 62, 63, 826, 73, 48, 12, 66, 19, 30};
        //1.获得该数组的元素个数
        System.out.println(a.length);
        //2.获得该数组中的第7个元素
        System.out.println(a[6]);
        //3.判断第7个元素是不是37？
        System.out.println(a[7] == 37);
        //4.判断数组中是否存在数值37？
        boolean iru = false;
        for (int x : a) {
            if (x == 37) {
                iru = true;
            }
        }
        System.out.println(iru);
        //5.将第一个元素与第二个元素的值互换
        a[0] = a[0] + a[1];
        a[1] = a[0] - a[1];
        a[0] = a[0] - a[1];
        //6.将第一个元素与倒数第二个元素的值互换
        a[0] = a[0] + a[a.length - 2];
        a[a.length - 2] = a[0] - a[a.length - 2];
        a[0] = a[0] - a[a.length - 2];
        //7.创建一个新数组，与原数组长度相同，并依次将原数组中的数据 赋值到新数组中
        int[] c = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            c[j] = a[j];
        }
        //8.创建一个新数组，与原数组长度相同，并将源数组逆序的方式放置新数组中
        int[] d = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            d[j] = a[i];
        }
        //9.将以上数据按从小到大排序
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] += a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] -= a[j + 1];
                }
            }
        }


        //Arrays.sort(a);
        //Arrays.sort(c);
        //Arrays.sort(d);
        //10.输出100以内的偶数
        for (int i = 0; i < 100; i += 2) {
            System.out.print(i + " ");
        }

        int[] x = {10, 20, 30, 40};
        //11.创建一个新数组，长度原数组长度多一，添加一个新元素33在合适的位置
        int[] y = new int[x.length + 1];
        for (int i = 0; i < x.length; i++)
            y[i] = x[i];
        y[y.length - 1] = 33;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y.length - i - 1; j++) {
                if (y[j] > y[j + 1]) {
                    y[j] += y[j + 1];
                    y[j + 1] = y[j] - a[j + 1];
                    y[j] -= y[j + 1];
                }
            }
        }

        //int m =183202;
        //12.将一个整数倒置为另一个整数

        //System.out.println("\n"+new StringBuilder(String.valueOf(m)).reverse());

        for (int m = 183202; m > 0; m /= 10) System.out.print(m % 10);
    }
}
