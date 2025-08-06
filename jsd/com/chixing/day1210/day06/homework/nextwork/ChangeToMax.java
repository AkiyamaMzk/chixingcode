package chixing.day1210.day06.homework.nextwork;

import java.util.Scanner;

public class ChangeToMax {
    public static void main(String[] args) {
        final Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        // SC.nextLine();

        while (n-- >= 0) {
            String s = SC.nextLine();
            //System.out.println("读入的是: " + s);
            int nums[]=new int[s.length()];
            for (int i=0;i<s.length();i++) {
                nums[i]=s.charAt(i)-'0';
            }
            for(int j=nums.length-1;j>0;j--)
                for(int i=nums.length-1;i>=nums.length-j;i--){
                    if(nums[i-1]<nums[i]-1) {
                        int temp=nums[i-1];
                        nums[i-1]=nums[i]-1;
                        nums[i]=temp;
                    }
                }
            for (int i=0;i<s.length();i++){
                System.out.print(nums[i]);
            }
            System.out.println();

        }


    }
}
