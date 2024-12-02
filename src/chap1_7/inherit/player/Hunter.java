package chap1_7.inherit.player;

public class Hunter {

    String nickname;
    int level;
    int hp;

    int concentrate; // 집중 게이지

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentrate = 100;
    }

    // 상태정보를 확인하는 메서드
    public void showStatus() {
        System.out.println("===== Player's Info =====");
        System.out.println("# 닉네임: " + nickname);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }

    // 사냥꾼 스킬
    public void summonBeast() {

    }
}
