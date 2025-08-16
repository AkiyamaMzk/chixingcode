package chixing.day10220.day20.hmwk.Q3;

import chixing.day10220.day20.hmwk.Q3.Contract.ContractStatus;
import chixing.day10220.day20.hmwk.Q3.ContractTask.Action;

public class ContractMain {//complete
    public static void main(String[] args) {
        ContractService createProxy =(ContractService)new ContractProxy(new ContractServiceImp()).CreateProxy();
        Contract contract1=new Contract("001", "丰川集团", "技术部", 10000, ContractStatus.DRAFT);
        Contract contract2=new Contract("002", "丰川集团", "技术部", 10000, ContractStatus.DRAFT);
        Contract contract3=new Contract("003", "丰川集团", "技术部", 10000, ContractStatus.DRAFT);
        ContractTask task1 = new ContractTask(createProxy, contract1, Action.SUBMIT);
        ContractTask task2 = new ContractTask(createProxy, contract2, Action.SUBMIT);
        ContractTask task3 = new ContractTask(createProxy, contract3, Action.SUBMIT);
        ContractTask task4 = new ContractTask(createProxy, contract1, Action.APPROVE);
        ContractTask task5 = new ContractTask(createProxy, contract1, Action.TOTAL);
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        new Thread(task4).start();
        new Thread(task5).start();
    }
}
