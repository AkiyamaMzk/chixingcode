package chixing.day10220.day13.echiwork.Q5;

import chixing.dayNull.SimpleProduct;

public class ProductWithBrand extends SimpleProduct {
    private String Brand;

    public ProductWithBrand(String name, double price, String brand) {
        super(name, price);
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductWithBrand other = (ProductWithBrand) obj;
        if (Brand == null) {
            if (other.Brand != null)
                return false;
        } else if (!Brand.equals(other.Brand))
            return false;
        return true;
    }
    

}
