package chap1_3.practice;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(20, 30);

        int area = rect.calculateArea();
        System.out.println("area = " + area);

        int peri = rect.calculatePerimeter();
        System.out.println("peri = " + peri);
    }
}
