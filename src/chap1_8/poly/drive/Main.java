package chap1_8.poly.drive;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Car sonata3 = new Sonata();

        // 쏘나타를 배열에 저장
//        Sonata[] sonataList = {sonata1, sonata2, sonata3};
//
//        for (Sonata s : sonataList) {
//            s.accelerate();
//        }

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

//        Tucson[] tucsonList = {tucson1, tucson2};

        Car tesla1 = new Tesla();
        Car tesla2 = new Tesla();
        Car tesla3 = new Tesla();
        Car tesla4 = new Tesla();

//        Tesla[] teslaList = {tesla1, tesla2, tesla3, tesla4};

        // 다형성을 통해 동종모음 구조배열을
        // 이종모음 형태로 구현할 수 있다.
        Car[] carList = {sonata1, tucson1, tesla2, sonata2};

        for (Car car : carList) {

        }

    }
}
