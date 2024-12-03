package chap1_9.static_;

import static chap1_9.static_.Count.*;

public class Main {
    public static void main(String[] args) {

        x = 10;
        m1();

        // 객체 생성
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        c1.m2();
        c2.m2();
        c3.m2();

        c1.y = 10;
        c2.y++;
        c3.y = -9999;
        c2.y *= 2;

        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        x = 99;
        x -= 92;
        x = 50000;
        System.out.println("c1.x = " + x);
        System.out.println("c2.x = " + x);
        System.out.println("c3.x = " + x);


        System.out.println(Math.PI);
    }
}
