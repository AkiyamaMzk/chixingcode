package chixing.day10220.day17.fac;

public class factoryFactory {
    public static Factory getFactory(String type) {
        Factory factory = null;
        switch (type) {
        case "1":
            factory = new type1Factory();
            break;
        case "2":
            factory = new type2Factory();
            break;
        case "3":
            factory = new type3Factory();
            break;
        default:
            break;
        }
        return factory;
    }
}
