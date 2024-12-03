package chap1_9.util;

// import static : static데이터를 참조할 때 앞에 붙이는 클래스명을 생략 가능
import static chap1_9.util.InputUtil.*;
import static java.lang.Math.*;

public class Test {

    public static void main(String[] args) {

        double random = random();
        System.out.println(PI);

        String name = inputStr("이름: ");
        String address = inputStr("주소: ");
        int age = inputInt("나이: ");
    }
}
