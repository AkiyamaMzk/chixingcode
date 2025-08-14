//package chixing.day10220.day16.wk.Q3;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import chixing.dayNull.SimpleStudent;
//
//public class Studnets {
//    public static void main(String[] args) {
//        List<SimpleStudent> studentList = new ArrayList<>();
//        String url = "jsd\\com\\chixing\\day10220\\day16\\wk\\Q3\\student.xlsx";
//        try (FileInputStream is = new FileInputStream(url); Workbook student = new XSSFWorkbook(is)) {
//            Sheet sheet = student.getSheetAt(0);
//            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//                Row row = sheet.getRow(i);
//                studentList.add(
//                        new SimpleStudent(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue()));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (SimpleStudent simpleStudent : studentList) {
//            System.out.println(simpleStudent);
//        }
//
//    }
//}
