package chap2_8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.*;
import static java.util.stream.Collectors.*;

// map: 리스트에서 원하는 데이터만 선택해서 추출
// original: [ {}, {}, {} ]
// filtering: [ {}, {} ]
// mapping: [ "", "" ]
public class Mapping {

    public static void main(String[] args) {

        // 요리의 이름들만 추출해서 매핑
        List<String> dishNameList = menuList.stream()
                .map(menu -> menu.getName())
                .collect(toList());

        System.out.println("dishNameList = " + dishNameList);
        System.out.println(dishNameList.size());

        System.out.println("===================");

        List<String> browsers = List.of(
                "safari", "chrome", "ms edge",
                "opera", "firefox"
        );

        List<Integer> lengthList = browsers.stream()
                .map(b -> b.length())
                .collect(toList());

        System.out.println("lengthList = " + lengthList);

        List<Character> characterList = browsers.stream()
                .map(b -> b.charAt(0))
                .collect(toList());

        System.out.println("characterList = " + characterList);

        System.out.println("=====================");
        
        // 요리 중에 요리이름과 칼로리만 추출해서
        // 새로운 객체로 포장하여 배열에 담고싶음.
        List<Object> menuDetails = menuList.stream()
                .map(menu -> {
                    Map<String, Object> menuMap = new HashMap<>();
                    menuMap.put("menuName", menu.getName());
                    menuMap.put("calories", menu.getCalories());
                    return menuMap;
                })
                .collect(toList());

        System.out.println("menuDetails = " + menuDetails);

        System.out.println("==================");

        List<SimpleDish> simpleDishes = menuList.stream()
                .map(menu -> new SimpleDish(menu))
                .collect(toList());

        simpleDishes.forEach(System.out::println);

        System.out.println("====================");

        /*
            요리 중에 500칼로리 이상의
            메뉴 이름들만 추출
         */
        List<String> highCaloriesNames = menuList.stream()
                .filter(m -> m.getCalories() >= 500)
                .map(m -> m.getName())
                .collect(toList());

        System.out.println("highCaloriesNames = " + highCaloriesNames);


        System.out.println("===============");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER 기타라고 저장
         */
        menuList.stream()
                .filter(m -> m.getCalories() > 500)
                .map(DishDetail::new)
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("==================");

        // 요리의 총 칼로리 수 구하기
        int totalCalories = menuList.stream()
                .mapToInt(m -> m.getCalories())
                .sum();

        System.out.println("totalCalories = " + totalCalories);

        // 평균 칼로리 구하기
        double average = menuList.stream()
                .mapToInt(m -> m.getCalories())
                .average()
                .getAsDouble();

        System.out.println("average = " + average);


    }
}
