package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

// protected: 다른 패키지의 접근을 차단,
// 단 상속관계에 있다면 부분적으로 허용
public class D extends A {

    void test() {
//        A a = new A(100);
//        a.f1 = 20;
    }
    D() {
        super(500);  // 부모의 생성자를 호출

        super.f1 = 10;
//        super.f2 = 10;

        super.m1();
//        super.m2();
    }
}
