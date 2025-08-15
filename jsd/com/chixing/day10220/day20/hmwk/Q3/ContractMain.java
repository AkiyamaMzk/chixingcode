package chixing.day10220.day20.hmwk.Q3;

import java.util.List;
import java.util.Map;

public class ContractMain {//not complete
    public static void main(String[] args) {

        ContractProxy proxy = new ContractProxy(new ContractServiceImp()) {
            @Override
            protected boolean isPrintLog() {
                return true;
            }

            @Override
            protected void addLog() {
                System.out.println("操作已记录到日志");
            }
        };
        ContractService proxyService = (ContractService) proxy.CreateProxy();

        Contract c1 = new Contract("O001", "供应商A", "技术部", 200000, Contract.ContractStatus.DRAFT);
        Contract c2 = new Contract("O002", "供应商B", "技术部", 300000, Contract.ContractStatus.DRAFT);
        Contract c3 = new Contract("O003", "供应商A", "财务部", 150000, Contract.ContractStatus.DRAFT);

        ContractTask task1 = new ContractTask() {
            @Override
            public void run() {
                proxyService.submitForApproval(c1);
                System.out.println("合同 " + c1.getContractId() + " 提交审批，状态: " + c1.getContractStatus());

                proxyService.submitForApproval(c2);
                proxyService.approve(c2);
                System.out.println("合同 " + c2.getContractId() + " 审批通过，状态: " + c2.getContractStatus());

                proxyService.submitForApproval(c3);
                proxyService.reject(c3);
                System.out.println("合同 " + c3.getContractId() + " 被拒绝，状态: " + c3.getContractStatus());
            }
        };
        new Thread(task1).start();

        // 等待线程完成
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }


        double totalTech = proxyService.totalAmountByDepartment("技术部");
        System.out.println("技术部合同总金额: " + totalTech);


        Map<String, List<Contract>> grouped = proxyService.groupBySupplier();
        System.out.print("按供应商分组合同: ");
        for (Map.Entry<String, List<Contract>> entry : grouped.entrySet()) {
            System.out.print(entry.getKey() + " -> [");
            List<Contract> list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).getContractId());
                if (i != list.size() - 1)
                    System.out.print(",");
            }
            System.out.print("] ");
        }
    }
}
