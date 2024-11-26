package chap1_3.practice;

import java.util.UUID;

public class Student {
    String studentId;
    String name;
    int grade;

    // 학생 정보 생성할 때 필요한 정보를 내놔라
    Student(String nm, int grd) {
        studentId = UUID.randomUUID().toString();
        name = nm;
        grade = grd;
    }

    // 학년 정보를 수정
    void updateGrade(int newGrade) {
        grade = newGrade;
        System.out.printf("학년이 %d학년으로 수정되었습니다.\n", grade);
    }

    void printStudentInfo() {
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
    }

}
