package chap1_8.practice.q2;

public class Main {

    public static void main(String[] args) {

        PayrollManager manager = new PayrollManager();

        manager.printPay(new FullTimeEmployee(2000000));

        manager.printPay(new PartTimeEmployee(10000, 14));
    }
}
