package chap1_8.poly.computer;

import chap1_3.Dancer;
import chap1_5.player.Player;

public class Main {
    public static void main(String[] args) {

        Computer myCom = new Computer();
        // 초기에 내 키보드를 세팅
        myCom.keyboard = new LgKeyboard();
        // 키보드 교체
        myCom.changeKeyboard(new SamsungKeyboard());


    }
}
