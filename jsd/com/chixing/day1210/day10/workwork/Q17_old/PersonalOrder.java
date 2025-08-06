package chixing.day1210.day10.workwork.Q17_old;

public class PersonalOrder implements Order {
    private int productNum;
    private PersonalOrder[] ordersSplitList = null;
    private int size = 0;//记录当前元素数量

    public PersonalOrder(int productNum) {
        ordersSplitList = new PersonalOrder[10];
        this.productNum = productNum;
        orderAdd(this);

    }

    public int getProductNum() {
        return productNum;
    }

    @Override
    public PersonalOrder[] split() {
        PersonalOrder[] orderSplit = new PersonalOrder[2];
        orderSplit[0] = new PersonalOrder(this.productNum / 2);
        orderSplit[1] = new PersonalOrder(this.productNum / 2);
        if (this.productNum % 2 != 0) orderSplit[1].productNum++;
        return orderSplit;
    }

    @Override
    public void orderadd() {
        System.out.println("请输入添加的订单");
    }


    private void orderAdd(PersonalOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].productNum > 1000) orderAdd(orders[i].split());
            else orderAdd(orders[i]);
        }
    }


    public void orderAdd(PersonalOrder order) {
        if (order.productNum > 1000) orderAdd(order.split());
        else {
            if (size >= this.ordersSplitList.length)
                this.expansion();
            this.ordersSplitList[size++] = order;
        }
    }

    public void expansion() {
        PersonalOrder[] expansionArray = new PersonalOrder[this.ordersSplitList.length * 2 + 2];
        for (int i = 0; i < this.ordersSplitList.length; i++)
            expansionArray[i] = this.ordersSplitList[i];
        this.ordersSplitList = expansionArray;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            res.append(ordersSplitList[i].productNum);
            if (i < size - 1) res.append(" ");
        }
        return res.toString() + '}';
    }
}
