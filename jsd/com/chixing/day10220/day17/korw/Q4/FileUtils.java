package chixing.day10220.day17.korw.Q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class FileUtils {
    static File createFile(String url, String fileName) {
        File dir = new File(url);
        if (!dir.isDirectory())
            throw new IllegalArgumentException("不是文件夹地址");
        try {
            File createdFile = new File(dir, fileName);
            createdFile.createNewFile();
            return createdFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static File writeToFile(String fileurl, String s) {
        try (OutputStream os = new FileOutputStream(fileurl);) {
            os.write(s.getBytes());
            os.flush();
            return new File(fileurl);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static String readFromFile(String fileUrl) {
        try (InputStream is = new FileInputStream(fileUrl);) {
            String read = new String(is.readAllBytes());
            return read;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
