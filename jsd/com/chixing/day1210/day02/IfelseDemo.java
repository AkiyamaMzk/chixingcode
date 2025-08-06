package chixing.day1210.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IfelseDemo {
    public static void main(String[] args) {
        System.out.println("输入数组长度：");
        int n=new Scanner(System.in).nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=new Scanner(System.in).nextInt();
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            System.out.println((arr[arr.length/2]+arr[arr.length+1])/2);
        }
        else {
            System.out.println(arr[arr.length/2]);
        }


    }
}
