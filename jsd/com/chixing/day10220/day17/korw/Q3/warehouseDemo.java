package chixing.day10220.day17.korw.Q3;

import java.lang.reflect.InvocationTargetException;

public class warehouseDemo {
    public static void main(String[] args) {
        Class houseClass = Warhouse.class;
        try {
            Object house = houseClass.getConstructor().newInstance();
            houseClass.getMethod("addNewType", Product.class).invoke(house, new Product(1, "Mr.White", 100, "云面大壳"));
            houseClass.getMethod("addNewType", Product.class).invoke(house, new Product(2, "Mr.White", 100, "云面中壳"));
            houseClass.getMethod("addNewType", Product.class).invoke(house, new Product(3, "Mr.White", 100, "云面小壳"));
            //houseClass.getMethod("addNewType", Product.class).invoke(house, new Product(1, "Mr.White", 100, "云面大壳"));
            houseClass.getMethod("inPut", Integer.class, int.class).invoke(house, 1, 50);
            houseClass.getMethod("outPut", Integer.class, int.class).invoke(house, 1, 50);
            houseClass.getMethod("outPut", Integer.class, int.class).invoke(house, 2, 150);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException
                | InstantiationException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
