package chap2_7.lambda;

public class AppleSomething implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == Color.RED && apple.getWeight() < 150;
    }
}
