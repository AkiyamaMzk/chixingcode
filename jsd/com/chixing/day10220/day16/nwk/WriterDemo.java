package chixing.day10220.day16.nwk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        Writer wi = null;
        try {
            wi = new FileWriter("jsd\\com\\chixing\\day10220\\day16\\CCiallo");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            wi.write("Ciallo~(∠ • ω < )⌒☆");
            wi.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                wi.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
