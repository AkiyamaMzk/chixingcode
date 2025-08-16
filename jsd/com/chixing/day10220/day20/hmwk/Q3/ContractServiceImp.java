package chixing.day10220.day20.hmwk.Q3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContractServiceImp implements ContractService {
    private List<Contract> contracts=new ArrayList<>();

    @Override
    public void submitForApproval(Contract contract) {//审批
        contract.setContractStatus(Contract.ContractStatus.PENDING_APPROVAL);
        contracts.add(contract);
    }

    @Override
    public void approve(Contract contract) {//通过合同
        contract.setContractStatus(Contract.ContractStatus.APPROVED);
    }

    @Override
    public void reject(Contract contract) {//驳回合同
        contract.setContractStatus(Contract.ContractStatus.REJECTED);
    }

    @Override
    public List<Contract> getContractsByStatus(Contract.ContractStatus status) {//根据状态查询合同
        List<Contract> result = new ArrayList<>();
        for (Contract contract : contracts) {
            if (contract.getContractStatus() == status) {
                result.add(contract);
            }
        }
        return result;
    }

    @Override
    public double totalAmountByDepartment(String dept) {//计算某个部门的合同总金额
        double res = 0;
        for (Contract contract : contracts) {
            if (contract.getDepartment().equals(dept)) {
                res += contract.getContractAmount();
            }
        }
        return res;
    }

    @Override
    public Map<String, List<Contract>> groupBySupplier() {//按供应商获取合同
        Map<String, List<Contract>> result = new HashMap<>();
        for (Contract contract : contracts) {
            String supplier = contract.getSupplier();
            result.putIfAbsent(supplier, new ArrayList<>());
            result.get(supplier).add(contract);
        }
        return result;
    }


}
