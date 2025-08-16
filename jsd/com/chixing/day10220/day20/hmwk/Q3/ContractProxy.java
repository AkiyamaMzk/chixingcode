package chixing.day10220.day20.hmwk.Q3;

import java.lang.reflect.Method;

import chixing.dayNull.SimpleProxy;

public class ContractProxy extends SimpleProxy{

    public ContractProxy(Object target) {
        super(target);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("正在启动："+method.getName());
        Object returnvalue=method.invoke(target, args);
        switch (method.getName()) {
            case "submitForApproval":
                System.out.println("合同ID："+((Contract)args[0]).getContractId()+"提交审批，状态: PENDING_APPROVAL");
                break;
            case "approve":
                System.out.println("合同ID："+((Contract)args[0]).getContractId()+"审批通过，状态: APPROVED");
                break;
            case "totalAmountByDepartment":
                System.out.println("部门："+args[0]+"合同总金额: "+returnvalue);
                break;
            case "groupBySupplier":
                System.out.println("按供应商分组合同: "+returnvalue);
                break;
            default:
                break;
        }
        if(isPrintLog())
            addLog();
        return returnvalue;
    }

    

}
