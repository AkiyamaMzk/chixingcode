package chixing.day10220.day19;

public class PublicREsource {
    private int proNum = 0;

    public PublicREsource() {
    }

    public PublicREsource(int proNum) {
        this.proNum = proNum;
    }

    public synchronized void product() {
        System.out.println("Time product");
        while (proNum == 50) {
            System.out.println("over 10");
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        proNum++;
        System.out.println("product a broad");
        this.notify();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public synchronized void consume() {
        System.out.println("consume now");
        while (proNum == 0) {
            System.out.println("no broad");
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        proNum--;
        System.out.println("eat one broad");
        this.notify();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
