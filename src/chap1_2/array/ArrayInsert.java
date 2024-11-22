package chap1_2.array;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 90, 100, 150};

        int targetIndex = 2;
        int newNumber = 70;

        // actual: [ 10, 50, 90, 100, 150 ]

        // 1. 사이즈가 1 큰 배열을 생성 후 기존 데이터를 모두 복사
        // copy:  [ 10, 50, 90, 100, 150, 0 ]
        int[] temp = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }

        // 2. 마지막 데이터부터 시작해서 한 칸씩 뒤로 복사
        for (int i = numbers.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

        // [ 10, 50, 90, 100, 150, 150 ]
//        temp[5] = temp[4];
        // [ 10, 50, 90, 100, 100, 150 ]
//        temp[4] = temp[3];
        // [ 10, 50, 90, 90, 100, 150 ]
//        temp[3] = temp[2];

        // 3. 2번 인덱스에 값을 새로운 값으로 수정
        // [ 10, 50, 70, 90, 100, 150 ]
        temp[targetIndex] = newNumber;

        numbers = temp;
        temp = null;

        // expect: [ 10, 50, 70, 90, 100, 150 ]
        System.out.println(Arrays.toString(numbers));

    }
}
