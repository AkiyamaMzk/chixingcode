package chixing.day10220.day19;

public class ResourceTest {
    public static void main(String[] args) {
        PublicREsource resource = new PublicREsource();
        Consume consume = new Consume(resource);
        Product product = new Product(resource);
        consume.start();
        product.start();
    }

}
