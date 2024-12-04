package chap1_9.final_;

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹야옹~");
    }

//    @Override
//    public void eat() {
//        System.out.println("생선얌얌냠");
//    }
}

public class Animal {

    public final void eat() {
        System.out.println("밥암냠냠~");
    }

    public void makeSound() {
        System.out.println("동물의 울음소리~");
    }
}
