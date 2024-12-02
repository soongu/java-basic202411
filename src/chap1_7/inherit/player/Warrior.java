package chap1_7.inherit.player;

public class Warrior {

    // 모든 직업 공통 속성
    String nickname;
    int level;
    int hp;

    // 직업 개별 속성
    int rage; // 분노게이지

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

    // 모든 직업 공통 기능
    // 상태정보를 확인하는 메서드
    public void showStatus() {
        System.out.println("===== Player's Info =====");
        System.out.println("# 닉네임: " + nickname);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
    // 개별 직업 기능
    // 전사 스킬
    public void dash() {

    }

}
