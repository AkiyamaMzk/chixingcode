package chixing.day10220.day16.wk.Q1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
    public static void main(String[] args) {
        String url = "jsd\\com\\chixing\\day10220\\day16\\wk\\Q1\\copydirectory";
        String pasteName = "pastephoto.png";
        String copyName = "copyphoto.png";
        File newFile = null;
        newFile = new File(url, pasteName);
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new FileInputStream(url + "\\" + copyName);//同时读入写入
                OutputStream outputStream = new FileOutputStream(url + "\\" + pasteName)) {
            byte[] buffer = new byte[4096];// 每次读取4kb
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
