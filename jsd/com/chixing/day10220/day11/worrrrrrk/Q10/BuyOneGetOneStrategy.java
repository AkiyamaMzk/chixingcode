package chixing.day10220.day11.worrrrrrk.Q10;

public  final class BuyOneGetOneStrategy extends PricingStrategyImp{
    private static final BuyOneGetOneStrategy BUY_ONE_GET_ONE_STRATEGY =new BuyOneGetOneStrategy();
    private BuyOneGetOneStrategy(){}
    public static BuyOneGetOneStrategy getInstance(){
        return BUY_ONE_GET_ONE_STRATEGY;
    }
    @Override
    public double calculate(Product product) {
        this.product=product;
        return buyOneGetOneStrategy();
    }

    @Override
    public String toString() {
        return "买一送一";
    }
}
