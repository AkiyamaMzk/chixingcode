package chixing.day10220.day20.hmwk.Q3;

public class Contract {
    private String contractId;
    private String supplier;
    private String department;
    private double contractAmount;
    private ContractStatus contractStatus = ContractStatus.DRAFT;

    public enum ContractStatus {
        DRAFT, PENDING_APPROVAL, APPROVED, REJECTED, COMPLETED
    }

    public Contract(String contractId, String supplier, String department, double contractAmount,
            ContractStatus contractStatus) {
        this.contractId = contractId;
        this.supplier = supplier;
        this.department = department;
        this.contractAmount = contractAmount;
        this.contractStatus = contractStatus;
    }

    public String getContractId() {
        return contractId;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getDepartment() {
        return department;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public ContractStatus getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(ContractStatus contractStatus) {
        this.contractStatus = contractStatus;
    }
}
