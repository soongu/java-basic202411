package practice.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberController {

    // 필드 - 의존성 필드 (객체가 일을 하기 위해 다른 객체에 의존(협력))
    Scanner sc;
    MemberRepository mr;

    MemberController() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    // 프로그램 초기 화면 출력
    void mainView() {
        System.out.println("\n#####  회원 관리 시스템  #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("================================");
    }

    // 프로그램을 실행하는 메서드
    void start() {
        while (true) {
            mainView();
            String menuNum = prompt(">> ");

            switch (menuNum) {
                case "1":
                    System.out.println("회원정보 등록 시작!");
                    break;
                case "2":
                    showAllMembers();
                    break;
                case "7":
                    System.out.println("프로그램 종료하기!");
                    return;
            }
        }
    }

    // 전체 회원 정보를 화면에 출력하는 메서드
    void showAllMembers() {
        // 전체 회원정보를 가져옴
        Member[] members = mr.getMembers();
        System.out.println("\n========= 전체 회원 정보 ===========");
        for (Member m : members) {
            m.inform();
        }
        System.out.println("\n======== 엔터를 눌러서 계속.... ======");
        // 입력커서를 생성해서 코드를 잠시 중단시킴
        sc.nextLine();
    }


    // 입력을 쉽게 처리해주는 메서드
    String prompt(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
