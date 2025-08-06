package chixing.day1210.day07_inherited.homework;

import java.util.Objects;

public class Question4 {
    class MyOrder {
        private int orderId;
        private String orderNumber;
        private float orderPrice;
        private int orderStatus;  // 订单状态，0：未支付，1：已支付，2： 已取消

        public String getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public float getOrderPrice() {
            return orderPrice;
        }

        public void setOrderPrice(float orderPrice) {
            this.orderPrice = orderPrice;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }
// 构造函数，getter和setter略

        @Override
        public boolean equals(Object obj) {
            if(this==obj) return true;
            if(obj==null||obj.getClass()!=getClass()||
            orderNumber==null||((MyOrder) obj).getOrderNumber()==null) return false;
            MyOrder that=(MyOrder) obj;
            return this.orderId== that.getOrderId()
                    &&this.orderNumber.equals(that.getOrderNumber())
                    &&this.orderPrice==that.getOrderPrice()
                    &&this.orderStatus==that.getOrderStatus();
        }
        @Override
        public int hashCode(){
            return Objects.hash(orderId,orderNumber,orderPrice,orderStatus);
        }


    }
}
