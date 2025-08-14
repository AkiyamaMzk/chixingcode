package chixing.day10220.day19;

public class Product extends Thread{
    private PublicREsource punlicREsource;

    public Product(PublicREsource punlicREsource) {
        this.punlicREsource = punlicREsource;
    }
    @Override
    public void run() {
        while (true) {
            punlicREsource.product();
        }
    }
}
