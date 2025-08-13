package chixing.day10220.day18.echiwork.Q5;

class Buffer {
    private int data;
    private boolean hasData = false;//只设置一个位置

    public synchronized void produce(int value) throws InterruptedException {//生产者,向缓冲区添加数据
        while (hasData) wait();//满数据等待
        data = value;
        hasData = true;//加入后直接设置为满`
        notify();//唤醒消费者
    }

    public synchronized int consume() throws InterruptedException {//消费者从缓冲区取走数据
        while (!hasData) wait();//无数据等待
        hasData = false;
        notify();//唤醒生产者
        return data;
    }
}
