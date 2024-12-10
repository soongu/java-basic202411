package chap2_8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static chap2_8.stream.DishType.*;
import static chap2_8.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeats = menuList.stream()
                .filter(m -> m.getType() == MEAT)
                .sorted(Comparator.comparing(d -> d.getCalories()))
                .collect(toList());

        lowCalorieMeats.forEach(System.out::println);

        System.out.println("==================");

        // 메뉴들을 이름 내림차로 정렬 (zyx순)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("================");

        // 칼로리가 300이상인 요리 중 칼로리가 낮은 탑3를 필터링

    }
}
