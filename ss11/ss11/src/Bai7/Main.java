package Bai7;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("a ", 30000),
                new PartTimeEmployee("b", 25000, 4),
                new FullTimeEmployee("c", 20000),
                new PartTimeEmployee("d", 30000, 5)
        };

        for (Employee emp : employees) {
            System.out.println("Nhân viên: " + emp.getName());
            System.out.println("Lương: " + emp.calculateSalary() + "VNĐ");
            System.out.println();
        }
    }
}
