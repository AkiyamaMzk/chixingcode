package chixing.day10220.day11.worrrrrrk.Q9;

import java.time.LocalDateTime;

public class applicantTest {
    public static void main(String[] args) {
        Approver app1=new LeaveRequest("主管", LocalDateTime.now(),"下班");
        Approver app2=new ExpenseRequest("财务",LocalDateTime.now(),"加班费");
        Approver app3=new ExpenseRequest("人事",LocalDateTime.now(),"奖金");
        app1.approve((ApprovalRequest) app1);
        app2.approve((ApprovalRequest) app2);
        app3.approve(null);

    }


}
