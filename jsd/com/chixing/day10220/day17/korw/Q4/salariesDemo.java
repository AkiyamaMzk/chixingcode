package chixing.day10220.day17.korw.Q4;

import java.util.ArrayList;
import java.util.List;

public class salariesDemo {
    public static void main(String[] args) {
        { // 添加
          // String s = """
          // empId,empName,empSalary
          // 1001,张三,8500.00
          // 1002,李四,9200.00
          // 1003,王五,7800.00
          // 1004,赵六,10500.00
          // 1005,钱七,9500.00
          // 1006,孙八,11000.00
          // 1007,周九,8800.00
          // 1008,吴十,12500.00
          // 1009,郑十一,10200.00
          // 1010,冯十二,11500.00
          // """;
          // FileUtils.createFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4",
          // "salaries.txt");
          // FileUtils.writeToFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4\\salaries.txt",
          // s);}
            ;
        }
        String s = FileUtils.readFromFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4\\salaries.txt");
        List<Employee> employeeList = new ArrayList<>();
        boolean isFirstLine = true;
        for (String line : s.split("\\n")) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }
            String[] parts = line.split(",");
            // System.out.println(parts[0]+parts[1]+parts[2]);
            employeeList.add(new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2])));
        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
