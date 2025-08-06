package chixing.day1210.day04;



public class ArrayDemo {
    public static void main(String[] args) {
        int x=10;
        System.out.println(isExist(null, x));
    }

    public static boolean isExist(int[] src, int e) {
        for (int x : src)
            if (x == e) return true;
        return false;
    }

}
