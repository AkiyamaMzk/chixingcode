package chixing.day10220.day17.korw.Q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import chixing.day10220.day17.FileUtil;

import java.io.FileOutputStream;
import java.io.FileReader;

public class FileUtils extends FileUtil{
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

    static File writeToFile(String fileurl, String s, boolean append) {
        try (OutputStream os = new FileOutputStream(fileurl, append);) {
            os.write(s.getBytes());
            os.flush();
            return new File(fileurl);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static File writeToFile(File file, String s, boolean append){
        return writeToFile(file.getAbsolutePath(),s,append);
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

    static String readFromFile(File file) {
        return readFromFile(file.getAbsolutePath());
    }
    static String[] readFromFilebyline(File file, boolean dropFirstLine) {
        return readFromFilebyline(file.getAbsolutePath(), dropFirstLine);
    }


    static String[] readFromFilebyline(String fileUrl, boolean dropFirstLine) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileUrl));) {
            ArrayList<String> res = new ArrayList<>();
            if (dropFirstLine)
                br.readLine();
            String line = null;
            while ((line = br.readLine()) != null)
                res.add(line);
            return res.toArray(new String[0]);
        } catch (Exception e) {
            return null;
        }
    }

}
