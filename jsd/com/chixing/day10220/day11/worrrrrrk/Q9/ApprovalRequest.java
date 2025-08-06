package chixing.day10220.day11.worrrrrrk.Q9;


import java.time.LocalDateTime;


public abstract class ApprovalRequest implements Approver{
    private String applicantName;
    private LocalDateTime applicantTime;
    private String description;
    public  void approve(ApprovalRequest request){
        System.out.println(String.format("%-3s",applicantName) +":"+String.format("%-20s-",description) +applicantTime);
    }

    public ApprovalRequest(String applicantName, LocalDateTime applicantTime, String description) {
        this.applicantName = applicantName;
        this.applicantTime = applicantTime;
        this.description = description;
    }
}
