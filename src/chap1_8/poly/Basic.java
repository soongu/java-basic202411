package chap1_8.poly;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

/*
          Object
            |
            A
         /    \
        B     C
        |     |
        D     E
 */

public class Basic {

    public static void main(String[] args) {

        // 다형성: 객체가 다양한 형태를 가지고 있는 성질
        //                다양한 타입을 사용할 수 있다.
        //                (부모의 타입)
        // 전제: 상속관계에서만 가능함

    // type      constructor
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();
        B x4 = new D();
        Object x5 = new E();
    }
}
