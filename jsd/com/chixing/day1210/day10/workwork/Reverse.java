package chixing.day1210.day10.workwork;

import java.util.Scanner;



public class Reverse {
    public static String reverse(String src){
        char[] arr=src.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            char temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return new String(arr);
    }


    public static void main(String[] args) {
        final Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        System.out.println(reverse(str));
        StringBuilder sb=new StringBuilder();
        sb.reverse();
    }
}
