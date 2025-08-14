package chixing.day10220.day19.Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 创建一个固定线程数线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        // 
        ExecutorService poo2 = Executors.newScheduledThreadPool(0);

        // 提交10个任务
        for (int i = 1; i <= 10; i++) {
            int taskNum = i;
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " 执行任务 " + taskNum);
                try {
                    Thread.sleep(1000); // 模拟任务执行耗时
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // 关闭线程池
        pool.shutdown();
    }
}