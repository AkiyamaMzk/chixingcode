package chixing.day10220.day20.hmwk.Q3;

public class ContractTask implements Runnable {
    private ContractService contractService;
    private Contract contract;
    private Action action; // 操作类型

    enum Action{
       SUBMIT,
       APPROVE,
       REJECT,
       TOTAL
    }



    public ContractTask(ContractService contractService, Contract contract, Action action) {
        this.contractService = contractService;
        this.contract=contract;
        this.action = action;
    }


    
    @Override
    public void run() {
        switch (action) {
            case SUBMIT:
                contractService.submitForApproval(contract);
                break;
            case APPROVE:
                contractService.approve(contract);
                break;
            case REJECT:
                contractService.reject(contract);
                break;
            case TOTAL:
                contractService.totalAmountByDepartment(contract.getDepartment());
                break;
            default:
                System.out.println("未知操作: " + action);
        }
    }
}
