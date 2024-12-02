package chap1_7.practice.q1;

public class Main {
    public static void main(String[] args) {

        Employee park = new Employee("박영희", 3000000);
        Manager ko = new Manager("고길동", 4000000, 500000);

        park.work();
        System.out.printf("%s님의 급여: %.0f원\n", park.name, park.getSalary());
        ko.work();
        System.out.printf("%s님의 총 수령액: %.0f원\n", ko.name, ko.getTotalCompensation());
    }
}
