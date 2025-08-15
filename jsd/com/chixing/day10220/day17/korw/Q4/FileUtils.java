package chixing.day10220.day17.korw.Q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileReader;
import chixing.day10220.day17.FileUtil;

public class FileUtils extends FileUtil {
    /**
     * 在目标地址创建文件
     * @param url      目标地址
     * @param fileName 创建文件名称
     * @return  创建后的文件
     */
    public static File createFile(String url, String fileName) {
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

    public static File createFile(File file) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    /**
     * 将字符串写入目标文件
     * @param fileurl 要写入的文件地址
     * @param s       写入的字符串
     * @param append  开启时把写入的字符串添加到文件结尾，否则覆盖原文件
     * @return 进行写入后的文件
     */
    public static File writeToFile(String fileurl, String s, boolean append) {
        try (OutputStream os = new FileOutputStream(fileurl, append);) {
            os.write(s.getBytes());
            os.flush();
            return new File(fileurl);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static File writeToFile(File file, String s, boolean append) {
        return writeToFile(file.getAbsolutePath(), s, append);
    }

    /**
     * 将目标文件作为字符串读取
     * @param fileUrl 读取的文件
     * @return  读取的字符串
     */
    public static String readFromFile(String fileUrl) {
        try (InputStream is = new FileInputStream(fileUrl);) {
            String read = new String(is.readAllBytes());
            return read;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String readFromFile(File file) {
        return readFromFile(file.getAbsolutePath());
    }

    /**
     * 以行作为单位读取目标文件
     * @param fileUrl       文件地址
     * @param dropFirstLine 是否跳过第一行
     * @return  String[]的每一个元素为源文件中一行字符
     */
    public static String[] readFromFilebyline(String fileUrl, boolean dropFirstLine) {
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

    public static String[] readFromFilebyline(File file, boolean dropFirstLine) {
        return readFromFilebyline(file.getAbsolutePath(), dropFirstLine);
    }

}
