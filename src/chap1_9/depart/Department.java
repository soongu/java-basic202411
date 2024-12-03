package chap1_9.depart;

// 학과 설계도
public class Department {

    private String departmentName; // 학과명
    private int studentCount; // 학과 학생 수

    private static int totalStudentCount; // 모든 학과 학생수 총합

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudentCount += this.studentCount;
    }

    // 학생 수를 추가하는 메서드
    public void addStudent(int number) {
        this.studentCount += number;
        totalStudentCount += number;
    }
    // 학과 학생 수를 조회하는 메서드
    public int getStudentCount() {
        return studentCount;
    }

    // 모든 학과 학생 수를 조회하는 메서드
    public static int getTotalStudentCount() {
        return totalStudentCount;
    }
}
