package chap1_7.practice.q2;

public class ElectricCar extends Car {

    // private 필드: 배터리 용량 (kWh)
    private double batteryCapacity;

    // 생성자: 제조사, 모델명, 제조 연도, 배터리 용량을 초기화
    public ElectricCar(String make, String model, int year, double batteryCapacity) {
        super(make, model, year); // 부모 클래스의 생성자 호출
        this.batteryCapacity = batteryCapacity;
    }

    // 메서드 오버라이딩: 전기차가 시동을 거는 동작
    @Override
    public void start() {
        System.out.println(make + " " + model + "이(가) 조용히 시동을 겁니다.");
    }

    // 메서드: 배터리 용량에 따른 예상 주행 거리를 출력
    public void displayRange() {
        System.out.println("예상 주행 거리: " + (batteryCapacity * 5) + "km");
    }
}
