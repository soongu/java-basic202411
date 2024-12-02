package chap1_7.practice.q2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("기아", "카니발", 2023);
        ElectricCar electricCar = new ElectricCar("포르쉐", "타이칸", 2022, 300);

        car.start();
        electricCar.start();

        electricCar.displayRange();
    }
}
