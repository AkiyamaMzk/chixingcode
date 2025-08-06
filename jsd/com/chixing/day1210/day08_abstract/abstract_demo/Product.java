package chixing.day1210.day08_abstract.abstract_demo;

public class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return super.equals(obj);
        if (obj == null || getClass() != obj.getClass() ||
                ((Product) obj).getProductName() == null || this.getProductName() == null) return false;
        Product that = (Product) obj;
        return
                that.getProductName().equals(this.getProductName()) &&
                that.getProductId() == this.getProductId();
    }
    @Override
    public int hashCode() {
        int result=productId;
        result+=31*result+( productName!=null? productName.hashCode():0);
        return result;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
