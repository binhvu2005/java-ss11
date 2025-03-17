package Bai10;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("a", 10000),
                new Developer("b", 5000),
                new Developer("c", 4500),
                new Manager("s", 9500),
                new Developer("e", 5200)
        };

        System.out.println("\nCuộc họp đang diễn ra");
        for (Employee employee : employees) {
            if (employee instanceof AttendMeeting) {
                ((AttendMeeting) employee).attendMeeting();
            }
        }

        System.out.println("\nTrạng thái công việc");
        for (Employee employee : employees) {
            employee.work();
        }
    }
}