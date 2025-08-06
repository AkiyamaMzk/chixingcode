package chixing.day1210.day10.workwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class getOnlyChar {
    public static void main(String[] args) {
        final Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();
        char[] arr = str.toCharArray();
//        Arrays.sort(arr);
//        char res=' ';
//        for(int i=1;i<arr.length-1;i++)
//            if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]) {
//                res=arr[i];
//                break;
//            }
//        System.out.println(res);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : arr) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        char res = ' ';
        for (char c : arr) {
            if (hashMap.get(c) == 1) {
                res = c;
                break;
            }
        }
        System.out.println(res);
    }
}
