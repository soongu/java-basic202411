package chap1_8.practice.q1;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(15, 20);

        ShapeManager manager = new ShapeManager();

        manager.printShapeInfo(rectangle);
    }
}
