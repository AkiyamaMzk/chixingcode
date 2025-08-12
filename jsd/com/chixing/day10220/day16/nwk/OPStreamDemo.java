package chixing.day10220.day16.nwk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OPStreamDemo {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("jsd\\com\\chixing\\day10220\\day16\\Ciallo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        String hello = "Ciallo~(∠ • ω < )⌒☆";
        try {
            os.write(hello.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
                System.out.println("OK");
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

    }
}
