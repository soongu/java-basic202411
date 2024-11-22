package chap1_2.array;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2; // [ 1, 3, 7, 9, 11 ]

        for (int i = targetIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i+1];
        }


        // 배열의 사이즈를 줄이기 전에 삭제 대상부터 뒤에 데이터를
        // 앞으로 한칸씩 땡겨야 함.
        // [ 1, 3, 5, 7, 9, 11 ]

//        numbers[2] = numbers[3];
        // [ 1, 3, 7, 7, 9, 11 ]

//        numbers[3] = numbers[4];
        // [ 1, 3, 7, 9, 9, 11 ]

//        numbers[4] = numbers[5];
        // [ 1, 3, 7, 9, 9, 11 ]

        // 맨 마지막 데이터 pop
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));

    }
}
