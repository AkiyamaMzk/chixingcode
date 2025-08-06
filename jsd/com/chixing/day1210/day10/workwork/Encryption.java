package chixing.day1210.day10.workwork;

import java.util.Scanner;

public class Encryption {

    public static String encryption(String src) {
        src = src.substring(1, src.length()) + src.charAt(0);
        char[] arr = src.toCharArray();
        for (int i = 0; i < arr.length; i++)
            arr[i] += 3;
        return new String(arr);
    }

    public static String decrypt(String src) {
        char[] arr = src.toCharArray();
        for (int i = 0; i < arr.length; i++)
            arr[i] -= 3;

        return arr[arr.length-1]+ new String(arr, 0, arr.length - 1);

    }


    public static void main(String[] args) {
        final Scanner SC = new Scanner(System.in);
        String str = SC.nextLine();

        System.out.println(encryption(str));
        System.out.println(decrypt(encryption(str)));
    }
}
