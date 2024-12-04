package chap1_9.practice.q5;

import static chap1_9.practice.q5.Genre.*;

public class Main {
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("뽀로로", "뽀로로저자", SCIENCE);
        LibraryBook book2 = new LibraryBook("해리포터", "조앤롤링", FICTION);

        book1.getBookInfo();
        System.out.println("=============");
        book2.getBookInfo();
    }
}
