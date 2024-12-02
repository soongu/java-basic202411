package chap1_7.practice.q2;

public class Car {

    // public 필드: 제조사와 모델명
    public String make;
    public String model;

    // protected 필드: 제조 연도
    protected int year;

    // 생성자: 제조사, 모델명, 제조 연도를 초기화
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // 메서드: 자동차가 시동을 거는 동작
    public void start() {
        System.out.println(make + " " + model + "이(가) 시동을 겁니다.");
    }
}
