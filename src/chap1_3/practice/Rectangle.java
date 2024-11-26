package chap1_3.practice;

public class Rectangle {

    int width;
    int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int calculateArea() {
        return width * height;
    }
    int calculatePerimeter() {
        return (width + height) * 2;
    }
}
