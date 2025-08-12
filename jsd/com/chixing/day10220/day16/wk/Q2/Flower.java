package chixing.day10220.day16.wk.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Flower {
    public static void main(String[] args) {
        List<Record> flos = new ArrayList<>();
        List<Record> errorFlos = new ArrayList<>();

        try (BufferedReader bridget = new BufferedReader(
                new FileReader("jsd\\com\\chixing\\day10220\\day16\\wk\\Q2\\flow.txt"))) {// 结束try后直接关闭资源
            String line;
            line = bridget.readLine();// 跳过第一行
            while ((line = bridget.readLine()) != null) {
                try {
                    Record record = sToR(line);
                    flos.add(record);
                } catch (IllegalArgumentException e) {//捕获异常,把数据加入errorflos
                    String[] parts = line.split("\\|");
                    errorFlos.add(new Record(parts[0], parts[1], parts[2], parts[3].equals("1") ? 'F' : 'M', parts[4],
                            null, Double.parseDouble(parts[6])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Record record : flos) {
            System.out.println(record);
        }
        System.out.println();
        for (Record record : errorFlos) {
            System.out.println(record);
        }
    }

    public static Record sToR(String src) {
        String[] parts = src.split("\\|");
        LocalDateTime time;
        if (parts[5].equals("null"))
            time = null;
        else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            time = LocalDateTime.parse(parts[5], formatter);
        }
        if (time == null)
            throw new IllegalArgumentException("error date");//抛出异常
        return new Record(parts[0], parts[1], parts[2], parts[3].equals("1") ? 'M' : 'F', parts[4], time,
                Double.parseDouble(parts[6]));
    }

}
