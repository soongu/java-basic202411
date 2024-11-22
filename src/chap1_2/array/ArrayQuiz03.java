package chap1_2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        while (true) {
            System.out.println("삭제할 이름을 입력하세요.");
            System.out.print(">> ");
            String deleteTargetName = sc.nextLine();

            //탐색
            int index = -1;
            for (int i = 0; i < students.length; i++) {
                if (deleteTargetName.equals(students[i])) {
                    index = i;
                    break;
                }
            }

            if (index >= 0) {
                // 삭제 수행
                for (int i = index; i < students.length - 1; i++) {
                    students[i] = students[i+1];
                }
                // 배열 사이즈 줄여서 복사
                String[] temp = new String[students.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = students[i];
                }
                students = temp;
                System.out.println("- 삭제 후 배열: " + Arrays.toString(students));
                break;
            } else {
                System.out.printf("%s는(은) 없는 이름입니다.\n", deleteTargetName);
            }
        }

    }
}
