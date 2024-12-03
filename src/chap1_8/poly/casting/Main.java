package chap1_8.poly.casting;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 50;
        child.p1 = 200;

        child.parentMethod();
        child.childMethod();

        System.out.println("===========");

        Parent parent = new Parent();
        parent.p1 = 50;
//        parent.c1 = 200;

        parent.parentMethod();
//        parent.childMethod();

        System.out.println("===========");

        int g = 100;
        double x =  g;

        Parent castingChild = new Child();
        System.out.println("castingChild = " + castingChild);

        /*
            타입을 업캐스팅하는 것은 자식타입의 객체를 부모타입으로
            사용하는 것을 말하며 이것은 자동으로 처리된다.

            그러나 업캐스팅이 되면 자식의 원래의 속성과 기능을
            사용할 수 없는 문제가 생김.

            따라서 자식이 원래 기능을 사용하려면 수동으로 다운캐스팅해야 함.
         */
        castingChild.parentMethod();
        ((Child) castingChild).childMethod();


    }
}
