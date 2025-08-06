package chixing.day1210.day10;
public class Bank {
    private int fieldInt;
    private static Bank onlyBank=null;
    public static Bank getBankInstance(){
        if(onlyBank==null) onlyBank=new Bank();
        else System.out.println("只允许实例化一次");
        return onlyBank;
    }
    public static Bank getBankInstance(int fieldInt){
        if(onlyBank==null) onlyBank=new Bank(fieldInt);
        else System.out.println("只允许实例化一次");
        return onlyBank;
    }
    private Bank(){}

    private Bank(int fieldInt) {
        this.fieldInt = fieldInt;
    }
}
