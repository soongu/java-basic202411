package chap1_9.static_;

public class Main {
    public static void main(String[] args) {

        Count.x = 10;
        Count.m1();

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

        Count.x = 99;
        Count.x -= 92;
        Count.x = 50000;
        System.out.println("c1.x = " + Count.x);
        System.out.println("c2.x = " + Count.x);
        System.out.println("c3.x = " + Count.x);


        System.out.println(Math.PI);
    }
}
