package chixing.day1210.day07_inherited.homework.Question6;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees=new Employee[10];
        employees[0]=new FullTimeEmployee(101,"FTE1",2010,50);
        employees[1]=new PartTimeEmployee(102,"PTE1",12,20);
        employees[2]=new SalesEmployee(103,"SE1",2010,39,0.01);
        for(int i=0;i<3;i++){
            System.out.println(employees[i]);
        }
    }
}
