package chixing.day10220.day18.echiwork.Qextra;

public class TickTest {
    public static void main(String[] args) {
        TicketSeller seller = new TicketSeller(50);
        for (int i = 0; i < 7; i++) {
            Thread window = new Thread(seller, "windows"+(i+1));
            window.start();
        }
    }
}
