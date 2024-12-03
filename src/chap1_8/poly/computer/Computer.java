package chap1_8.poly.computer;

/*
       const computer = {
            keyboard: {}
        }
 */
public class Computer {

    // 필드: 객체의 속성 - 객체를 이루고 있는 데이터
    // 다형성은 객체의 교환성을 높여주어
    // 객체가 특정 객체에 종속(의존)되지 않도록 하게 해준다.
    Keyboard keyboard;

    // 키보드를 교체하는 기능
    public void changeKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        System.out.println("키보드가 교체되었습니다.");
    }
}
