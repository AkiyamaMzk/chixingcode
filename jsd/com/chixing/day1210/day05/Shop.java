package chixing.day1210.day05;

/**
 * 店铺
 * public:可被类外访问
 * private:只允许类内访问
 * <p>
 * 1、安全性：元数据不被暴露出去
 * 2、耦合性低：该类的属性，只归本类自己管理
 */

public class Shop {
    private int shopId;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public float getShopScore() {
        return shopScore;
    }

    public void setShopScore(float shopScore) {
        this.shopScore = shopScore;
    }

    private String shopName;
    private String branchName;
    private float shopScore;


    //初始化对象intitial objiect ini/init
    public Shop(int shopId, String shopName, String branchName, float shopScore) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.branchName = branchName;
        this.shopScore = shopScore;

    }public Shop(int shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }
    public Shop(){}


}
