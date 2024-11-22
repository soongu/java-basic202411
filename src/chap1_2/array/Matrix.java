package chap1_2.array;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        // 2차원 배열
        /*
            [
                [1,2,3],
                [4,5,6],
                [7,8,9]
            ]
         */

        // 국영수 점수를 저장
        int kor = 77;
        int eng = 100;
        int math = 99;

        // 우리반 학생들의 국영수 점수를 저장
        int[] scoresKim = {kor, eng, math};
        int[] scoresPark = {100, 22, 56};
        int[] scoresHong = {40, 90, 80};

        // 2차원 배열
        int[][] classScores = {scoresKim, scoresPark, scoresHong};

        /*
            [
                [77,100,99],
                [100,22,56],
                [40,90,80]
            ]
         */
        System.out.println(classScores.length);
        System.out.println(scoresKim);
        System.out.println(classScores[0]);
        System.out.println(Arrays.toString(classScores[0]));
        System.out.println(classScores[2][1]);

        System.out.println(Arrays.toString(classScores));
        System.out.println(Arrays.deepToString(classScores));

        System.out.println("==============");

        int[][] arr2d = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };

        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("========================");

        // 배열의 값 없이 생성만 하고 싶으면
        int[][] arr32 = new int[3][2];

        System.out.println(Arrays.deepToString(arr32));

        int[][][] arr3d = {
            {
                {1,2}, {3,4}
            },
            {
                {5,6}, {7,8}
            }
        };

    }
}
