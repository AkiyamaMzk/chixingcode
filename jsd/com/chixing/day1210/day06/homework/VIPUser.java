package chixing.day1210.day06.homework;

public class VIPUser extends User{
    private int viplevel;

    public VIPUser(String userName, int point, int viplevel) {
        super(userName, point);
        this.viplevel = viplevel;
    }
    public boolean canAccessSpecialSale( ){
        return this.viplevel>=3;
    }
}
