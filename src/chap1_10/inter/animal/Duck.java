package chap1_10.inter.animal;

public class Duck implements Pet {

    @Override
    public void sleep() {
        Pet.super.sleep();
    }

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }
}
