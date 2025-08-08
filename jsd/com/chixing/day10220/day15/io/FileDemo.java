package chixing.day10220.day15.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) {
        File file1 = new File("jsd\\com\\chixing\\day10220\\day15\\io");
        file1.mkdir(); // make directory

        File file2 = new File(file1, "ciallo");
        try {
            file2.createNewFile(); // create new File
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 获得file1,file2 文件的名称
        file1.getName();
        file2.getName();
        // 获得file1,file2 文件的路径
        file1.getPath();
        file2.getPath();
        // 判断file1 是不是文件夹
        file1.isDirectory();
        // 判断file2 是不是文件
        file2.isFile();
        // 获得file1父文件夹的名称
        file1.getParent();
        // 获得file1父文件夹的对象
        file1.getParentFile();

        //File file3 = new File("jsd\\com\\chixing\\day10220\\day15"); // 这是一个文件夹，下面有其他子文件夹或子文件
        // 获得file3下面的其他子文件(夹)对象
        //Arrays.stream(file3.listFiles()).forEach(System.out::println);
        Arrays.stream( getAllSubFiles("jsd\\com\\chixing\\day10220\\day15")).forEach(System.out::println);

    }

    /**
     * 在指定的目录下 查找文件
     * 
     * @param path     指定的目录
     * @param fileName 要查找的文件名称
     * @return 若找到该文件,则返回该文件对象;若找不到,则返回null
     */
    public static File[] searchFile(String path, String fileName) {
        File[] files = getAllSubFiles(path);
        List<File> res = new ArrayList<>();
        if (files != null)
            for (File file : files) {
                if (file.getName().contains(fileName))
                    res.add(file);
            }
        return res.toArray(new File[0]);
    }

    /**
     * 获得指定目录下的所有的子文件，若子文件对象是 文件夹，则继续遍历 直到是子文件对象 注意判断是文件夹还是文件， 以及空文件夹的处理
     * 
     * @param path 指定目录
     * @return 返回所有的子文件对象集合
     */
    static File[] getAllSubFiles(String path) {
        File file = new File(path);
        if (!file.exists() || !file.isDirectory()) {
            System.out.println("Not Directory");
            return new File[0];//返回null在foreach时会出现空指针
        }
        List<File> res = new ArrayList<>();
        File[] dir = file.listFiles();// 储存listFiles的值,节约性能
        if (dir == null)
            return new File[0];
        for (File subFile : dir) {
            if (subFile.isDirectory())
                res.addAll(Arrays.asList((getAllSubFiles(subFile.getPath()))));
            else
                res.add(subFile);
        }
        return res.toArray(new File[0]);
    }
}
