package chixing.day1210.day05;

public class MainBoard {
    private String mainboardType;
    private String mainboardBrand;
    private double mainboardprice;

    @Override
    public String toString() {
        return "MainBoard{" +
                "mainboardType='" + mainboardType + '\'' +
                ", mainboardBrand='" + mainboardBrand + '\'' +
                ", mainboardprice=" + mainboardprice +
                '}';
    }

    public String getMainboardBrand() {
        return mainboardBrand;
    }

    public void setMainboardBrand(String mainboardBrand) {
        this.mainboardBrand = mainboardBrand;
    }

    public double getMainboardprice() {
        return mainboardprice;
    }

    public void setMainboardprice(double mainboardprice) {
        this.mainboardprice = mainboardprice;
    }

    public String getMainboardType() {
        return mainboardType;
    }

    public void setMainboardType(String mainboardType) {
        this.mainboardType = mainboardType;
    }
}
