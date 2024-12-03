package chap1_9.depart;

public class Main {

    public static void main(String[] args) {

        Department comSci = new Department("컴퓨터 과학과", 200);
        Department biology = new Department("생물학과", 140);
        Department chemistry = new Department("화학과", 120);
        Department korean = new Department("국어국문학과", 220);

        korean.addStudent(20);
        biology.addStudent(50);

        System.out.println("전체 학생 수: " + Department.getTotalStudentCount());
    }
}
