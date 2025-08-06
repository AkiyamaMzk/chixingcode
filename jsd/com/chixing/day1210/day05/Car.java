package chixing.day1210.day05;

public class Car {
    private int carId;
    private String carName;
    private String carBrand;
    public Car(){
        //存在有参数的构造函数时，将覆盖隐藏的的无参构造函数，不声明无参数的构造函数将无法使用
    }
    public Car(int carId){
        this.carId=carId;
    }
    public Car(String carName,String carBrand){
        this.carName=carName;
        this.carBrand=carBrand;
    }
    public Car(int carId,String carName,String carBrand){
        this(carId);//调用时需放在第一行
        this.carName=carName;
        this.carBrand=carBrand;
    }
}
