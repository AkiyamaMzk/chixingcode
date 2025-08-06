package chixing.day10220.day12;
import javax.swing.*;

import chixing.day10220.day12.exception.BalanceNotEnoughException;

import java.util.Scanner;

public class TryDemo {
    public static Integer fun1(){
        int a=10;
        int b=0;
        try {
            return a/b;
        }catch (ArithmeticException e){
            return -1;
        }finally {
            //null
        }
    }


    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setAlignmentX(JPanel.CENTER_ALIGNMENT);


        JLabel label=new JLabel("   余额不足!");
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(label);

        JButton button=new JButton("确定");
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(button);

        frame.add(panel);

        int n=new Scanner(System.in).nextInt();
        CreditAccount acc1 = new CreditAccount();
        acc1.setAccBalance(200);
        try {
            acc1.withdraw(n);
        }catch (BalanceNotEnoughException e){
            frame.setVisible(true);
            try{
                acc1.withdraw(acc1.getAccBalance());
            }catch (BalanceNotEnoughException ee) {
                //never catch
            }
        }catch (Exception e){
            //null
        }finally {
            //null
        }


    }
}
