package chap1_9.practice.q2;

public class Employee {

    private long employeeId; // 사원 번호
    private String name;

    private static int idCount; // 일련번호 누적을 관리

    public Employee(String name) {
        this.employeeId = ++idCount;
        this.name = name;
    }

    public void getEmployeeInfo() {
        System.out.println("사번 = " + employeeId);
        System.out.println("이름 = " + name);
    }
}
