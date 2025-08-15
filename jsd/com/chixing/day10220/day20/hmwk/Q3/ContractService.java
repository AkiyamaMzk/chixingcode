package chixing.day10220.day20.hmwk.Q3;

import java.util.List;
import java.util.Map;

import chixing.day10220.day20.hmwk.Q3.Contract.ContractStatus;

public interface ContractService {

    // void submitForApproval(String contractId);
    void submitForApproval(Contract contract);

    // void approve(String contractId);
    void approve(Contract contract);

    // void reject(String contractId);
    void reject(Contract contract);

    // List<Contract> getContractsByStatus(Status status);
    List<Contract> getContractsByStatus(ContractStatus status);

    double totalAmountByDepartment(String dept);

    Map<String, List<Contract>> groupBySupplier();

}
