package chixing.day10220.day14.wokr.Q2;

import java.util.HashMap;
import java.util.Scanner;

public class NumCount {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, Integer> hash = new HashMap<>();
        String s = SC.nextLine();
        char[] ss = s.toCharArray();
        for (char c : ss) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        for (Character key : hash.keySet()) {
            System.out.println(key + " -> " + hash.get(key));
        }

    }

}
