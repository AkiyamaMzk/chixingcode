package chixing.day10220.day16.nwk;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo {
    public static void main(String[] args) {
        Reader re = null;
        try {
            re = new FileReader("jsd\\com\\chixing\\day10220\\day16\\CCiallo.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // StringBuilder str = new StringBuilder();
        // int c = 0;
        // try {
        // while ((c = re.read()) != -1) {
        // str.append((char) c);
        // }
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // } finally {
        // try {
        // re.close();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }
        // System.out.println(str);
        int c = 0, i = 0;
        char[] chars = new char[1024];
        try {
            while ((c = re.read()) != -1) {
                chars[i++] = (char) c;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                re.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(chars);
    }
}
