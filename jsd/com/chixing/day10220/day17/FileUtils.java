package chixing.day10220.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
    public static File fileCopy(File orangeFile, String destPath) {
        File destFile=new File(destPath,orangeFile.getName());
        try (InputStream is = new FileInputStream(orangeFile); OutputStream os = new FileOutputStream(destFile)) {
            byte[] buff = new byte[4096];// 4kb缓冲
            int read;
            while ((read = is.read(buff)) != -1) {
                os.write(buff, 0, read);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destFile;
    }

    public static File fileCopy(String fileString, String destPath) {
        File orangeFile = new File(fileString);
        return fileCopy(orangeFile, destPath);
    }
}
