package chap1_7.super_;

public class Child extends Parent {

//    public int a;
//    public double b;
    public boolean c;

    public Child() {
//        super();
        this(100);  // this()를 사용하면 super() 호출되지 않는다.
        System.out.println("Child의 첫번째 생성자 호출!");
    }
    public Child(int x) {
//        super();
        System.out.println("Child의 두번째 생성자 호출!");
    }

    public void subMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }
}
