package chap1_8.practice.q1;

public class Circle extends Shape {

    private double radius; // 반지름

    public Circle(double radius) {
        this.radius = radius;
    }

    // 원의 넓이는 구하는 메서드
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
