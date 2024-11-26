package chap1_2.function;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userList = {"김철수", "박영희", "홍길동"};

    public static void main(String[] args) {

        printFoods();

        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
//        remove(0);
        printFoods();
//
//
        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(1, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();
    } // end main

    static void modify(int index, String newFoodName) {
        if (isOutOfBounds(index)) return;
        foods[index] = newFoodName;
    }

    static boolean isOutOfBounds(int index) {
        return index < 0 || index >= foods.length;
    }


    // foods 배열의 요소를 출력
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static String[] copy(int capacity) {
        String[] newSizeArray = new String[foods.length + capacity];

        int loopCount = (capacity >= 0) ? foods.length : newSizeArray.length;

        System.arraycopy(foods, 0, newSizeArray, 0, loopCount);
        return newSizeArray;
    }

    // foods배열에 새 음식을 추가하는 함수
    static void push(String newFoodName) {
        // 1. 사이즈가 1개 더 큰 배열을 생성
        // 2. 원본내용을 복사
        String[] temp = copy(1);

        // 3. 배열의 맨 끝에 새 데이터 추가
        temp[temp.length - 1] = newFoodName;
        // 4. 주소값 이전
        foods = temp;
    }

    // foods배열에서 target을 찾아 인덱스를 알려주는 함수
    static int indexOf(String targetFoodName) {
        for (int i = 0; i < foods.length; i++) {
            if (targetFoodName.equals(foods[i])) {
                return i;
            }
        } // end for
        return -1;
    }

    // 배열의 맨 끝 데이터를 제거하는 함수
    static String pop() {
        if (foods.length == 0) {
            System.out.println("더 이상 제거할 수 없습니다.");
            return null;
        }

        String deletedFood = foods[foods.length - 1];
        foods = copy(-1);
        return deletedFood;
    }

    static boolean include(String targetFood) {
        return indexOf(targetFood) != -1;
    }

    // 음식이름으로 지우는 메서드
    static void remove(String targetFood) {
        if (!include(targetFood)) return;

        for (int i = indexOf(targetFood); i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }
    // 오버 로딩: 같은 이름으로 함수를 여러 개 만드는 기능
    static void remove(int index) {
        if (isOutOfBounds(index)) return;
        String foodName = foods[index];
        remove(foodName);
    }

    static void insert(int index, String newFoodName) {
        if (isOutOfBounds(index)) return;
        String[] temp = copy(1);

        for (int i = foods.length; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newFoodName;
        foods = temp;
    }

}
