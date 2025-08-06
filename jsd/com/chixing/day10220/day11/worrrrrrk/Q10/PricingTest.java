package chixing.day10220.day11.worrrrrrk.Q10;

public class PricingTest {
    static void  putOut(Product p,PricingContext pc){
        System.out.println("产品："+p.getName()+"\n"+"" +
                "原价："+p.getPrice()+"x"+p.getQuantity()+"件"+"\n"+
                       "使用策略："+pc.getStrategy()+"\n"+
                "实际价格："+pc.calculateFinalPrice(p));

    }


    public static void main(String[] args) {
        Product p1=new Product("诺顿的新手HP药剂","消耗品",200,99);
        Product p2=new Product("清泉流响","戒指",500000000,1);
        Product p3=new Product("罗莉安的至尊MP药剂 ","消耗品",12000,99);
        PricingContext pc=new PricingContext();

        pc.setStrategy(new DiscountStrategy(0.8));
        putOut(p1,pc);

        System.out.println();
        pc.setStrategy(new FullReductionStrategy(1000000,100000));
        putOut(p2,pc);

        System.out.println();
        pc.setStrategy(BuyOneGetOneStrategy.getInstance());
        putOut(p3,pc);
    }
}
