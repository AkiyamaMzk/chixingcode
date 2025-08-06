package chixing.day10220.day11;

public class Example {
    private static Example example;

    private Example() {
    }

    public static Example getExample() {
        if (example == null) example = new Example();
        return example;
    }
}
