package chixing.day10220.day12.generic;

import chixing.dayNull.Auto;

public class pointTest {
    public static void main(String[] args) {
        Point<Integer,Double> point1=new Point<>();
        point1.setX(80);
        point1.setY(100d);

        Point<?,?> point2=new Point<>(45d,89d);
        Auto<?> a= Auto.of(123456789134139L);
        Long l=Auto.get(a,long.class);

    }
}
