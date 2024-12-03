package chap1_9.static_;

public class Calculator {

    String color; // 계산기 색상
    static double pi; // 원주율

    // 계산기에 커스텀 색상을 추가하는 메서드
    void customColorize(String color) {
        this.color = color;
    }

    // 원의 넓이를 계산하는 메서드
    static double calcArea(int r) {
        return pi * r * r;
    }

}
