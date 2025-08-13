package chixing.day10220.day18.echiwork.Qextra;

public class TicketSeller extends Thread {
    private static int tickets = 100;

    public synchronized static void sellTicket(String windowName) {
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
            this.sellTicket(this.getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static void setTickets(int tickets) {
        TicketSeller.tickets = tickets;
    }

}
