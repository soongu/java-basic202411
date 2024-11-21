package chap1_2.array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        /*
            배열의 특징
            1. 동종 모음 구조 : 같은 타입의 데이터만 저장 가능
            2. 크기가 불변함: 크기를 동적으로 늘이거나 줄일 수 없음
         */

        // 배열 만들기
        // 1. 배열 변수 만들기
        int[] numbers; // numbers의 메모리 할당용량 -> 8바이트

        // 2. 배열 객체 생성하기
        numbers = new int[5];

        System.out.println("numbers = " + numbers);

        // 3. 배열 값 초기화 - 인덱스 사용
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] * 2;
        numbers[4] = 99;
//        numbers[5] = 7;

        // 4. 배열 값 확인하기
        System.out.println(Arrays.toString(numbers));

        // 배열 길이 확인하기
        System.out.println(numbers.length);

        System.out.println("====================");

        // 배열의 순회
        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("numbers[" + i + "]: " + numbers[i]);
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }

        System.out.println("====================");

        // 배열 전용 반복문: foreach, inhanced for loop
        // iter
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        // 배열 생성 단축 문법
        System.out.println("=====================");
//        String[] pets = new String[] {"멍멍이", "야옹이", "짹짹이"};

        // 배열 변수 선언과 동시에 초기화할 때는 new Type[] 생략 가능
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
        pets = new String[] {"어흥이", "냠냠이"};

        System.out.println(Arrays.toString(pets));

        // 배열의 기본 값
        /*
            자바의 배열은 생성되는 순간 해당 공간에 기본값들을 채워넣음
            정수형: 0
            실수형: 0.0
            논리형: false
            문자형: ''
            기타(String): null
         */
        System.out.println("===================");

        int[] points = new int[4];
        double[] dArr = new double[3];
        boolean[] bArr = new boolean[5];
        char[] cArr = new char[3];
        String[] sArr = new String[4];
        System.out.println(points.length);
        System.out.println(Arrays.toString(points));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(cArr));
        System.out.println(Arrays.toString(sArr));

        Math[] maths = new Math[2];
        System.out.println(Arrays.toString(maths));

    }
}
