package chixing.day10220.day12.generic;

/**
 *
 * @param <E>泛型(类型参数化)
 *           保证数据类型的安全性
 *
 */
public class Point<E,T> {
    private E x;
    private T y;

    public Point() {
    }

    public Point(E x, T y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public void setX(E x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
