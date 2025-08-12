package chixing.day10220.day16.wk.Q2;


import java.time.LocalDateTime;

public class Record {
    private String recordId;
    private String userId;
    private String institutionCode;//机构号
    private char gender;
    private String waterCode;//流水号
    private LocalDateTime pyDate;//交易日期
    private double pyAmount;//交易金额
    
    public Record(String recordId, String userId, String institutionCode, char gender, String waterCode,
            LocalDateTime pyDate, double prPrice) {
        this.recordId = recordId;
        this.userId = userId;
        this.institutionCode = institutionCode;
        this.gender = gender;
        this.waterCode = waterCode;
        this.pyDate = pyDate;
        this.prAmount = prPrice;
    }

    public LocalDateTime getPyDate() {
        return pyDate;
    }

    @Override
    public String toString() {
        return "Record [recordId=" + recordId + ", userId=" + userId + ", institutionCode=" + institutionCode
                + ", gender=" + gender + ", waterCode=" + waterCode + ", pyDate=" + pyDate + ", prPrice=" + prAmount
                + "]";
    }
    

}
