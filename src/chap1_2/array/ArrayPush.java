package chap1_2.array;

import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int newNumber = 50;

        // 1. 기존 배열 사이즈보다 1개 더 큰 사이즈의 새 배열을 생성
        int[] newArray = new int[numbers.length + 1];

        // 2. 원본 배열의 데이터를 새 배열로 복사 (인덱스는 그대로)
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        // 3. 새 배열의 끝인덱스에 새 데이터 수정
        newArray[newArray.length - 1] = newNumber;

        // 4. 사본의 주소를 원본에 복사
        numbers = newArray;
        newArray = null;

        System.out.println("원본: " + Arrays.toString(numbers));
        System.out.println("사본: " + Arrays.toString(newArray));
    }
}
