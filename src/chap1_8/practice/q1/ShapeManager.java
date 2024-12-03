package chap1_8.practice.q1;

public class ShapeManager {

    public void printShapeInfo(Shape shape) {
        double area = shape.area();
        double perimeter = shape.perimeter();
        System.out.println("도형의 넓이: " + area);
        System.out.println("도형의 둘레: " + perimeter);
    }
}
