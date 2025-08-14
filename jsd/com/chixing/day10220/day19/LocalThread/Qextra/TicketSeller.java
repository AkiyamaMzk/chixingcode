package chixing.day10220.day18.echiwork.Qextra;

public class TicketSeller implements Runnable {
    private  int tickets ;
    

    public TicketSeller(int tickets) {
        this.tickets = tickets;
    }

    public synchronized void sellTicket(String windowName) {
        if (tickets <= 0)
            return;
        int temp = tickets - 1;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(windowName + "卖出一张票，剩余票数：" + temp);
        tickets = temp;
    }

    @Override
    public void run() {
        while (tickets > 0) {
            this.sellTicket(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public  void setTickets(int tickets) {
        this.tickets = tickets;
    }

}
