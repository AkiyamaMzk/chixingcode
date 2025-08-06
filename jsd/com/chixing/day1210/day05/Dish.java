package chixing.day1210.day05;

public class Dish {
    private int dishId;
    private String dishName;
    private double dishPrice;

    public Dish() {
    }

    public Dish(int dishId, String dishName, double dishPrice, Shop dishShop) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dishShop = dishShop;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Shop getDishShop() {
        return dishShop;
    }

    public void setDishShop(Shop dishShop) {
        this.dishShop = dishShop;
    }

    private Shop dishShop;
}
