package chixing.day1210.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List arr = new ArrayList<Integer>();
        arr.add(sc.nextInt());
        //List arr2 = arr;
        List arr2=new ArrayList<Integer>(arr);
        arr2.clear();
        System.out.println(arr.size());
        List<List<Integer>> arr22= new ArrayList<>();
        arr22.add(Arrays.asList(1,2,3));
        System.out.println(arr22.get(0).get(0));
    }
}
