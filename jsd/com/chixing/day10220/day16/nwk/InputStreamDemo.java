package chixing.day10220.day16.nwk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class InputStreamDemo {
    public static void main(String[] args) {
        //input
        InputStream is = null;
        try {
            is = new FileInputStream("jsd\\com\\chixing\\day10220\\day16\\Ciallo.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        //read

        // String str = null;
        // try {
        // str=new String(is.readAllBytes());
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }finally{
        // try {
        // is.close();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }
        byte bytes[] = null;
        try {
            bytes = new byte[is.available()];//size of file
            int i = 0, b = 0;
            while ((b = is.read()) != -1)//read 1time
                bytes[i++] = (byte) b;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //output
        System.out.println(new String(bytes));



    }
}
