package chixing.day10220.day20.hmwk.Q4;

import java.lang.reflect.Method;

import chixing.dayNull.SimpleProxy;

public class RiderProxy extends SimpleProxy {

    public RiderProxy(Object target) {
        super(target);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在启动：" + method.getName());
        Object returnvalue = method.invoke(target, args);
        switch (method.getName()) {
        case "dispatch":
            Object orderDispatch = args[0];
            System.out.println("[派单] 订单" + ((Order) orderDispatch).getOrderId() + "派给骑手 "
                    + ((Order) orderDispatch).getRider().getRiderName() + ", 优先级: "
                    + ((Order) orderDispatch).getOrderPriority() + " 预计配送时间: "
                    + ((DispatchServiceImp) target).expectedDeliveryTime((Order) orderDispatch));
            break;
        case "finishDelivery":
            Object orderFinish = args[1];
            Object rider = args[0];

            System.out.println(
                    "[完成] 骑手 " + ((Rider) rider).getRiderName() + " 完成了订单 " + ((Order) orderFinish).getOrderId());
            break;

        default:
            break;
        }

        if (isPrintLog())
            addLog();
        return returnvalue;
    }

}
