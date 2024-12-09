package chap2_7.lambda;

import chap1_6.modi.pac1.A;

import java.util.ArrayList;
import java.util.List;

// 사과를 여러가지 방법으로 필터링
public class FilterApple {

    /**
     * @solution - try1: 사과바구니에서 색상이 녹색인 사과들만 필터링!
     * @param basket : 다양한 색상과 무게의 사과들이 들어있는 리스트
     * @return - basket안에서 녹색 사과들만 필터링해서 새 리스트에 담아서 반환
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면
     *             이 메서드로는 불가능하다
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 녹색 사과를 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @solution - try2: 색상을 파라미터화하여 원하는 컬러의 사과를 필터링!
     * @param basket : 다양한 색상과 무게의 사과들이 들어있는 리스트
     * @param color : 원하는 색상
     * @return - basket안에서 녹색 사과들만 필터링해서 새 리스트에 담아서 반환
     * @problem - 만약 필터링 기준이 색상이 아니라면
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {
        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 특정 색상의 사과를 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

}
