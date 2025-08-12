package chixing.day10220.day17.korw.Q4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class salariesDemo {
    public static void main(String[] args) {
        { // 添加
            String s = """
            empId,empName,empSalary
            1001,张三,850.00
            1002,李四,920.00
            1003,王五,780.00
            1004,赵六,10500.00
            1005,钱七,9500.00
            1006,孙八,11000.00
            1007,周九,8800.00
            1008,吴十,12500.00
            1009,郑十一,10200.00
            1010,冯十二,11500.00
                """;
            FileUtils.createFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4",
            "salaries.txt");
            FileUtils.writeToFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4\\salaries.txt",s,false);
            ;}
        List<Employee> employeeList = new ArrayList<>();
        File file = new File("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4\\salaries.txt");
        FileUtils.createFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4", "high_salary_report.txt");
        FileUtils.writeToFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4\\high_salary_report.txt", "empId,empName,empSalary\n", false);
        for (String line : FileUtils.readFromFilebyline(file, true)) {
            String[] parts = line.split(",");
            Employee employee = new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
            employeeList.add(employee);
            if (employee.getEmpSalary() > 2000)
                FileUtils.writeToFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4\\high_salary_report.txt",
                        employee.toString()+"\n", true);
        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }}
