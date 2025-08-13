package chixing.day10220.day17.korw.Q4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class salariesDemo {
    public static void main(String[] args) {
        File salaries = FileUtils.createFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4", "salaries.txt");
        File highSalaryReport = FileUtils.createFile("jsd\\com\\chixing\\day10220\\day17\\korw\\Q4","high_salary_report.txt");
        List<Employee> employeeList = new ArrayList<>();
        { // 添加
            String s = """
                    empId\tempName\tempSalary
                    1001\t张三\t850.00
                    1002\t李四\t920.00
                    1003\t王五\t780.00
                    1004\t赵六\t10500.00
                    1005\t钱七\t9500.00
                    1006\t孙八\t11000.00
                    1007\t周九\t8800.00
                    1008\t吴十\t12500.00
                    1009\t郑十一\t10200.00
                    1010\t冯十二\t11500.00
                        """;
            FileUtils.writeToFile(salaries, s, false);
            FileUtils.writeToFile(highSalaryReport, "empId\tempName\tempSalary\n", false);
            ;
        }
        dataProcessing(salaries, highSalaryReport, employeeList);
        
    }


    static void dataProcessing(File salaries, File highSalaryReport, List<Employee> employeeList) {
        for (String line : FileUtils.readFromFilebyline(salaries, true)) {
            String[] parts = line.split("\t");
            Employee employee = new Employee(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
            employeeList.add(employee);
            if (employee.getEmpSalary() > 2000)
                FileUtils.writeToFile(highSalaryReport, employee + "\n", true);
        }
    }
}
