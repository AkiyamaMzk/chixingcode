package chixing.day1210.day04;

import java.util.*;

import chixing.day1210.day03.SortDemo;

public class work4 {


    public static int[] arrAdd(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int i = 0;
        while (i < arr1.length) {
            arr3[i] = arr1[i++];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[i++] = arr2[j];
        }
        return arr3;
    }

    public static int[] dropRe(int[] src){
        Set<Integer> Repeat=new HashSet<>();
        int[] temp=src.clone();
        SortDemo.quickSort(temp);
        for(int i=1;i<temp.length;i++){
            if(temp[i]==temp[i-1]&&!Repeat.contains(temp[i])) Repeat.add(temp[i]);
        }
        List<Integer> res=new ArrayList<>();
        for(int x:src)
            res.add(x);
        res.removeIf(Repeat::contains);
        int[] resarr=new int[res.size()];
        for(int i=0;i<res.size();i++)
            resarr[i]=res.get(i);
        return resarr;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("arr1.length:");
        int l1 = sc.nextInt();
        System.out.println("arr1:");
        int arr1[] = new int[l1];
        for (int i = 0; i < l1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("arr2.length:");
        int l2 = sc.nextInt();
        System.out.println("arr2:");
        int arr2[] = new int[l2];
        for (int i = 0; i < l2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = arrAdd(arr1, arr2);
        SortDemo.quickSort(arr3);
        for (int x : arr3) {
            System.out.print(x + " ");
        }
        System.out.println();

        //2
        int[] a = {46, 49, 75, 80, 15, 46, 29, 58, 80, 46};
        int[] b = {46, 49, 75, 80, 15, 29, 58};
        a=dropRe(a);
        b=dropRe(b);
        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
        for (int x : b)
            System.out.print(x + " ");

        //3


    }
}
