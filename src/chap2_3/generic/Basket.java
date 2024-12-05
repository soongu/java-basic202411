package chap2_3.generic;

// 뭘 담을지는 모르겠지만 아무튼 바구니다
// F를 담을 건데 F는 언제결정되느냐? 바구니가 만들어질때 결정
public class Basket<F extends Fruit> {

    // F: 제네릭 타입 - 아직 설계당시에는 정확한 타입이 없는 상태
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
