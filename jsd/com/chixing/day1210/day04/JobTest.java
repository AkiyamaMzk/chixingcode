package chixing.day1210.day04;

public class JobTest {
    public static void main(String[] args) {
        Job job1=new Job();
        Job job2=new Job();
        job1.setJobId(001);
        job1.setJobName("测试工作1");
        job1.setJobDuty("测试职责1");
        job1.setJobCity("上海");
        job1.setJobMaxSalary(0);
        job1.setJonminSalary(0);
        System.out.println(job1.getJobId());
        double jobMaxSalary = job1.getJobMaxSalary();
        System.out.println(job1);

        job2.setJobId(002);
        job2.setJobName("测试工作2");
        job2.setJobDuty("测试职责2");
        job2.setJobCity("北京");
        job2.setJobMaxSalary(123456789);
        job2.setJonminSalary(0);

    }
}
