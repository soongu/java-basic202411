package chap1_9.practice.q1;

public class Car {
    private String model;
    private int year;
    private static int count;

    // 생성자: 객체가 생성될 때 호출
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        count++;
    }

    // 특정 자동차의 정보 출력
    public void getCarInfo() {
        System.out.println("model = " + this.model);
        System.out.println("year = " + this.year);
    }

    public static void getTotalCars() {
        System.out.println("count = " + count);
    }

}
