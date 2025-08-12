package chixing.day10220.day17.korw.Q3;

import java.util.HashMap;


public class Warhouse {
    private HashMap<Integer, Product> house = new HashMap<>();

    public void inPut(Integer proid,int num){
        Product p=house.get(proid);
        p.changeStock(num);
    }

    public void outPut(Integer proid,int num){
        Product p=house.get(proid);
        if(p.getProStock()<num){
            throw new IllegalArgumentException("库存不足,出库失败");
        }
        p.changeStock(-num);
    }

    public void addNewType(Product product){
        if(house.containsKey(product.getProId()))
            throw new IllegalArgumentException("已经有这个类型的产品信息了");
        house.put(product.getProId(), product);
    }

}
