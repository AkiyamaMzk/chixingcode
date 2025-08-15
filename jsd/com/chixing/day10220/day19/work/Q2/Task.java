package chixing.day10220.day19.work.Q2;

public interface Task extends Runnable {
    String getName(); // 返回任务名称

    void execute(); // 执行任务
}
