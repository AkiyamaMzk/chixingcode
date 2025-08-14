package chixing.day10220.day19.LocalThread;

import chixing.dayNull.SimpleStudent;

public class ThreadLocalDemo {
    private static ThreadLocal<SimpleStudent> threadLocal = ThreadLocal
            .withInitial(() -> new SimpleStudent("123", "321"));

    public static void main(String[] args) {

        Runnable task = () -> {
            if (Thread.currentThread().getName().equals("name1")) {
                SimpleStudent student = threadLocal.get();
                student.setStudentName("123");
            }
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        };

        Thread t1 = new Thread(task, "name1");
        Thread t2 = new Thread(task, "name2");
        t1.start();
        t2.start();
    }

}
