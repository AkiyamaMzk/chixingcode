package chixing.day1210.day03;

import java.util.Arrays;

public class SortDemo {

    /**
     * 交换arr中两个变量
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr, int a, int b) {
        if (a != b) {
            arr[a] += arr[b];
            arr[b] = arr[a] - arr[b];
            arr[a] -= arr[b];
        }
    }

    /**
     * 冒泡
     *
     * @param src 原数组
     */
    public static void bubboSort(int[] src) {
        for (int i = 0; i < src.length; i++)
            for (int j = 0; j < src.length - i - 1; j++)
                if (src[j] > src[j + 1]) {
                    swap(src, j, j + 1);
                }
    }

    /**
     * 选择排序
     *
     * @param src
     */
    public static void chooseSort(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < src.length; j++)
                if (src[j] < src[min]) min = j;
            swap(src, min, i);
        }
    }

    /**
     * 快速排序
     * 每次找到一个数的位置
     *
     * @param src 原数组
     */
    public static void quickSort(int[] src) {
        if (src.length > 1)
            quickS(src, 0, src.length - 1);
    }

    private static void quickS(int[] src, int left, int right) {
        if (left < right) {
            int index = portation(src, left, right);
            quickS(src, left, index - 1);
            quickS(src, index + 1, right);
        }
    }

    /**
     * 将pivot(最左端的元素)放到正确的位置
     *
     * @return 递归坐标
     */
    private static int portation(int[] src, int left, int right) {
        int pivot = left;
        int i = left + 1, j = right;
        while (i <= j) {
            while (i <= right && src[pivot] > src[i]) i++;
            while (j >= left && src[pivot] < src[j]) j--;
            if (i < j) {
                swap(src, i, j);
                i++;
                j--;
            } else
                break;
        }
        swap(src,j,pivot);
        return j;
    }

    /**
     * 归并排序
     * 每次将两个数组按顺序装入一个临时数组
     */
    public static void margeSort(int[] src) {
        margeS(src, 0, src.length - 1);
    }

    private static void margeS(int[] src, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            margeS(src, left, mid);
            margeS(src, mid + 1, right);
            marge(src, left, mid, right);
        }
    }

    private static void marge(int[] src, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (src[i] < src[j]) temp[k++] = src[i++];
            else temp[k++] = src[j++];
        }
        while (i <= mid) temp[k++] = src[i++];
        while (j <= right) temp[k++] = src[j++];
        for (int x = 0; x < temp.length; x++)
            src[left + x] = temp[x];
    }

    /**
     * 插入排序
     *
     * @param src
     */
    public static void insertSort(int[] src) {
        for (int i = 1; i < src.length; i++) {
            int key = src[i];
            int j = i - 1;
            while (j >= 0 && src[j] > key) {
                src[j + 1] = src[j];
                j--;
            }
            src[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int[] a = {67, 23, 12, 11, 56, 87, 77, 88, 98};
        int[] b = {1};
        int[] c = {};
        int[] d = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] test = a;
        //bubboSort(test);
        quickSort(test);
        //chooseSort(test);
        //margeSort(test);
        //insertSort(test);
        for (int x : test)
            System.out.print(x + " ");
    }
}
