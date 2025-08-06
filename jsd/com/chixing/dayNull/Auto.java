package chixing.dayNull;

public class Auto <E>{
    E auto;

    private Auto(E auto) {
        this.auto = auto;
    }

    public static <T> Auto<T> of(T value){
        return new Auto<>(value);
    }
    private E gett(){
        return auto;
    }
    public static <T> T get(Auto<?> auto,Class<T> type){
        return type.cast(auto.gett());
    }

}
