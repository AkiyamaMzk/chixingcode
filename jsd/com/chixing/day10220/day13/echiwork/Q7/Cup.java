package chixing.day10220.day13.echiwork.Q7;

public class Cup implements MyCompare {
    // 编号，名称，价格，产地，颜色，容量
    private String id;
    private String name;
    private double price;
    private String origin;
    private String color;
    private double capacity;

    @Override
    public int compare(Object o) {
        if (this == o)
            return 0;
        if (!(o instanceof Cup))
            return 0;
        Cup that = (Cup) o;
        if (this.name.equals(that.getName())) {
            if (this.price == that.getPrice()) {
                if (this.id.equals(that.getId())) {
                    return 0;
                }
                return this.id.compareTo(that.getId());
            }
            return this.name.compareTo(that.getName());
        }
        return Double.compare(this.price, that.getPrice());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }

    public String getColor() {
        return color;
    }

    public double getCapacity() {
        return capacity;
    }

}
