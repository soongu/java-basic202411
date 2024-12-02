package chap1_6.practice.q1;

public class LibraryMember {
    public String memberId;
    private String name;
    private int borrowedBooks;

    // 기본 생성자: 파라미터가 없는 생성자
    // 클래스 안에 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어짐
    public LibraryMember() {
    }

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
//        this.borrowedBooks = 0;
    }

    public void borrowBook() {
        if (borrowedBooks < 5) {
            borrowedBooks++;
            System.out.printf("%s님이 책을 한 권 빌렸습니다. 현재 빌린 책의 수: %d개\n", name, borrowedBooks);
        } else {
            System.out.printf("%s님은 이미 5권의 책을 빌리셨습니다. 더 이상 빌릴 수 없습니다.\n", name);
        }
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.printf("%s님이 책을 한 권 반납했습니다. 현재 빌린 책의 수: %d개\n", name, borrowedBooks);
        } else {
            System.out.printf("%s님은 반납할 책이 없습니다.\n", name);
        }
    }

    public void displayMemberInfo() {
        System.out.println("memberId = " + memberId);
        System.out.println("name = " + name);
        System.out.println("borrowedBooks = " + borrowedBooks);
    }
}
