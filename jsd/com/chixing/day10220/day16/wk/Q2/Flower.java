package chixing.day10220.day16.wk.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DateFormatter;

public class Flower {
    public static void main(String[] args) {
        List<Record> flos = new ArrayList<>();

        try (BufferedReader bridget = new BufferedReader(
                new FileReader("jsd\\com\\chixing\\day10220\\day16\\wk\\Q2\\flow.txt"))) {// 结束try后直接关闭资源
            String line;
            line = bridget.readLine();// 跳过第一行
            while ((line = bridget.readLine()) != null) {// 读取整行
                String[] parts = line.split("\\|");
                LocalDateTime time;
                if (parts[5] == null)
                    time = null;
                else {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYYMMDDHHMMSS");
                    time = LocalDateTime.parse(parts[5], formatter);
                }
                flos.add(new Record(parts[0], parts[1], parts[2], parts[3] == "1" ? 'M' : 'F', parts[4], time,
                        Double.parseDouble(parts[6])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Record record : flos) {
            System.out.println(record);
        }
    }

}
