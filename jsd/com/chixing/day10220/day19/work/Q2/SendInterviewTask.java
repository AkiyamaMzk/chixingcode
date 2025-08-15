package chixing.day10220.day19.work.Q2;

public class SendInterviewTask implements Task {

    @Override
    public void run() {
        execute();
    }

    @Override
    public String getName() {
        return "SendInterviewTask";
    }

    @Override
    public void execute() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(getName() + "执行完毕!");
    }

}
