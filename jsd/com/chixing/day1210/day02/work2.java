package chixing.day1210.day02;

import java.util.Arrays;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
       // 1
        int[] score={78,56,67,94,73,80,62,90,88,63};
        for(int i=0;i<score.length;i++){
            if((i==0||score[i]>score[i-1])&&(i==score.length-1||score[i]>score[i+1])){
                System.out.print(i+" ");
            }
            if((i==0||score[i]<score[i-1])&&(i==score.length-1||score[i]<score[i+1])){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //2
        System.out.println("输入数组长度：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            System.out.println((arr[arr.length/2]+arr[arr.length/2+1])/2);
        }
        else {
            System.out.println(arr[arr.length/2]);
        }
        //3
        for(int i=0;i<5;i++){
            for(int j=0;j<8-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<1+2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<8-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<1+2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=0;i--){
            for(int j=0;j<8-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<1+2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //4
        for(int i=2,j=5;j<=100;i+=2,j+=5){
            System.out.println(i+"*"+j+"="+i*j);
        }
        //5
        int[] a ={48,62,63,826,73,48,12,66,19,30};
        int odd=0,even=0;
        for(int x:a){
            if(x%2==1) odd++;
            else even++;
        }
        System.out.println(odd+" "+even);
        //6
        int N=new Scanner(System.in).nextInt();
        int[][] arr2=new int[N][];
        for (int i=0;i<N;i++){
            arr2[i]=new int[i+1];
            for(int j=0;j<arr2[i].length;j++){
                if (i==j||j==0) arr2[i][j]=1;
                else arr2[i][j]=arr2[i-1][j-1]+arr2[i-1][j];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}



/*
*   int[] arr;
*   for(int i=0;i<arr.length;i++)
*   arr[i];
*   for(int x:arr)
*   x
*
*
*
*
* */