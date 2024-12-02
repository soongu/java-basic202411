package chap1_6.practice.q1;

public class Main {
    public static void main(String[] args) {

        LibraryMember member1 = new LibraryMember("M001", "김영희");

        member1.borrowBook();
        member1.borrowBook();
        member1.borrowBook();
        member1.returnBook();

        member1.displayMemberInfo();
    }
}
