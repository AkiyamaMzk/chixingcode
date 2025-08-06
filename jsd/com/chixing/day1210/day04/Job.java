package chixing.day1210.day04;

public class Job {
    //id name duty minsalary maxsalary city
    int jobId;
    String jobName;
    String jobDuty;
    double jonminSalary;
    double jobMaxSalary;
    String jobCity;


    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDuty() {
        return jobDuty;
    }

    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty;
    }

    public double getJonminSalary() {
        return jonminSalary;
    }

    public void setJonminSalary(double jonminSalary) {
        this.jonminSalary = jonminSalary;
    }

    public double getJobMaxSalary() {
        return jobMaxSalary;
    }

    public void setJobMaxSalary(double jobMaxSalary) {
        this.jobMaxSalary = jobMaxSalary;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    @Override
    public String toString() {
        return "jobId=" + jobId + ", jobName='" + jobName + '\'' + ", jobDuty='" + jobDuty + '\'' + ", jonminSalary=" + jonminSalary + ", jobMaxSalary=" + jobMaxSalary + ", jobCity='" + jobCity + '\'';
    }
}
