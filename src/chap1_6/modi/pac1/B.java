package chap1_6.modi.pac1;

public class B {

    B() {
        A a = new A(); // public
        new A(50);   // default
//        new A(9.9); // private

        a.f1 = 10;   // public
        a.f2 = 11;   // default
//        a.f3 = 20;   // private

        a.m1();
        a.m2();
//        a.m3(); // private
    }
}
