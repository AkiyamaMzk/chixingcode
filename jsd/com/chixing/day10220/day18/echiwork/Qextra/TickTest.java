package chixing.day10220.day18.echiwork.Qextra;

public class TickTest {
    public static void main(String[] args) {
        String[] windows7={"窗口1","窗口2","窗口3","窗口4","窗口5","窗口6","窗口7"};
        for (String name : windows7) {
            TicketSeller t=new TicketSeller();
            t.setName(name);
            t.start();
        }
    }
}
