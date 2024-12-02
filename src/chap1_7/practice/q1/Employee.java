package chap1_7.practice.q1;

public class Employee {

    /*
        {
            name: '',
            salary: 0.0,
        }
     */
    public String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + "님이 일반 직원으로 일합니다.");
    }

    public double getSalary() {
        return salary;
    }

}
